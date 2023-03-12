package ru.kolomytsev.course2.two;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOfWordsTest {
    @Test(expected = MyArraySizeException.class)
    public void testArrayOf() throws MyArraySizeException, MyArrayDataException {
        ArrayOfWords arrayOfWords = new ArrayOfWords();
        arrayOfWords.arrayOf(new String[][]{});
    }

    @Test(expected = MyArraySizeException.class)
    public void testArrayOf1() throws MyArraySizeException, MyArrayDataException {
        ArrayOfWords arrayOfWords = new ArrayOfWords();
        arrayOfWords.arrayOf(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3"}, {"1", "2", "3", "4"}});
    }

    @Test(expected = MyArrayDataException.class)
    public void testArrayOf2() throws MyArraySizeException, MyArrayDataException {
        ArrayOfWords arrayOfWords = new ArrayOfWords();
        arrayOfWords.arrayOf(new String[][]{{"1", ";", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3"}, {"1", "2", "3", "4"}});
    }

    @Test
    public void testArrayOfSum() throws MyArraySizeException, MyArrayDataException {
        ArrayOfWords arrayOfWords = new ArrayOfWords();
        int sum = arrayOfWords.arrayOf(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}});
        Assert.assertEquals(40, sum);
    }
}