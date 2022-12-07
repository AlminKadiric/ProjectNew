package at.aau.serg.exercises.shapetesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class SquareTest {
    static RectangularShape square;

    @BeforeAll
    public static void setUp(){
        RectangularShapeFactory factory = new RectangularShapeFactory();
        square=factory.create(5);


    }




    @ParameterizedTest
     @ValueSource(ints = {10,20,30})
    public void givenNewSquare_whenIsEquilateral_thenReturnTrue(int sideLength){
        Square square = new Square(sideLength);
        Assertions.assertTrue(square.isEquilateral());
    }
    @Test
    public void givenNewSquare_whenGetWidth_thenReturnEquals(){
        Assertions.assertEquals(square.getWidth(),square.getHeight());


    }
    @Test
    public void givenNewSquareWithZeroSideLength_whenCreate_thenThrowException(){

       IllegalArgumentException exception =  Assertions.assertThrows(IllegalArgumentException.class,()->{Square square = new Square(0);});
        Assertions.assertEquals("The side length of a square has to be greater than 0.",exception.getMessage());

    }
    @Test
    public void givenNewSquare_whenGetSides_thenReturnCorrectValues() {
        Square square  = new Square(15);
        List<Side> sideList =square.getSides();
        Assertions.assertEquals(4,sideList.size());
        Assertions.assertEquals(15,sideList.get(0).getLength());
        Assertions.assertEquals(15,sideList.get(1).getLength());
        Assertions.assertEquals(15,sideList.get(2).getLength());
        Assertions.assertEquals(15,sideList.get(3).getLength());

    }
    }
