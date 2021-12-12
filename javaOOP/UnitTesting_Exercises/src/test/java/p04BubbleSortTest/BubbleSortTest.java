package UnitTesting_Exercises.src.test.java.p04BubbleSortTest;

import UnitTesting_Exercises.src.main.java.p04_BubbleSortTest.Bubble;
import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        int [] numbers = {1, 5, 3, 8, 0, -5};
        int[] expectedSortedArray = {-5, 0, 1, 3, 5, 8};
        Bubble.sort(numbers);
        Assert.assertArrayEquals(expectedSortedArray,numbers);
    }
}
