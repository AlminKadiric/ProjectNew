package at.aau.serg.exercises.shapetesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RectangleTest {
    static RectangularShape rectangle;

    @BeforeAll
    public static void setUp(){
        RectangularShapeFactory factory = new RectangularShapeFactory();
        rectangle=factory.create(20,30);


    }



    @Test

    public void givenNewRectangle_whenIsEquilateral_thenReturnFalse() {

        Assertions.assertFalse(rectangle.isEquilateral());
    }

    @Test
    public void givenNewRectangle_whenGetWidth_thenReturnNotEquals() {

        Assertions.assertNotEquals(rectangle.getWidth(), rectangle.getHeight());
    }

    @Test
    public void givenNewRectangleWithZeroWidth_whenCreate_thenThrowException() {

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {Rectangle rectangle = new Rectangle(0, 10);});
        Assertions.assertEquals("The width of a rectangle has to be greater than 0.",exception.getMessage());
    }
    @Test
    public void givenNewRectangleWithZeroHeight_whenCreate_thenThrowException() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {Rectangle rectangle = new Rectangle(10, 0);});
        Assertions.assertEquals("The height of a rectangle has to be greater than 0.",exception.getMessage());
    }
    @Test
    public void givenNewRectangle_whenGetSides_thenReturnCorrectValues(){

        List<Side> sideList = rectangle.getSides();
        Assertions.assertEquals(4, sideList.size());
        Assertions.assertEquals(30,sideList.get(0).getLength());
        Assertions.assertEquals(20,sideList.get(1).getLength());
        Assertions.assertEquals(30,sideList.get(2).getLength());
        Assertions.assertEquals(20,sideList.get(3).getLength());
    }


}