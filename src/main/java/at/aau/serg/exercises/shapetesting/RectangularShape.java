package at.aau.serg.exercises.shapetesting;

import java.util.List;

public interface RectangularShape {
    int getWidth();
    int getHeight();
    boolean isEquilateral();
    List<Side> getSides();
}
