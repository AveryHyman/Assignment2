/**
 * Author: Avery Hyman (amh0120)
 * Course: COMP 3700
 * Professor: Dr. Tung Nguyen
 */

import org.junit.*;
import static org.junit.Assert.assertEquals;

//Test class for Finder class
public class Finder_JUnitTest {
    private Finder finder = new Finder();

    //Tests finding the max value in a valid array
    @Test
    public void findMax_ValidArray(){
        int [] testArray = {2, 9, 8, 7, 8, 4, 1};
        Integer expected = 9;
        Integer actual = finder.findMax(testArray);
        assertEquals(expected, actual);
    }

    //Tests finding the min value in a valid array
    @Test
    public void findMin_ValidArray(){
        int [] testArray = {2, 9, 8, 7, 8, 4, 1};
        Integer expected = 1;
        Integer actual = finder.findMin(testArray);
        assertEquals(expected, actual);
    }

    //Tests that the findMax function can handle a null array
    @Test
    public void findMax_NullArray(){
        Integer actual = finder.findMax(null);
        assertEquals(actual, null);
    }

    //Tests that the findMin function can handle a null array
    @Test
    public void findMin_NullArray(){
        Integer actual = finder.findMin(null);
        assertEquals(actual, null);
    }

    //Tests that the findMax function can handle an empty array
    @Test
    public void findMax_EmptyArray(){
        int [] testArray = new int [3];
        Integer expected = 0;
        Integer actual = finder.findMax(testArray);
        assertEquals(actual, expected);
    }

    //Test that the findMin function can handle an empty array
    @Test
    public void findMin_EmptyArray(){
        int [] testArray = new int [3];
        Integer expected = 0;
        Integer actual = finder.findMin(testArray);
        assertEquals(actual, expected);
    }
}
