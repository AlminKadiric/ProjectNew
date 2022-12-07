package at.aau.serg.exercises.ringbuffer;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses( {BaseTest.class, FullCoverageTest.class, FullMutationScoreTest.class})
public class RingBufferTest {

}
