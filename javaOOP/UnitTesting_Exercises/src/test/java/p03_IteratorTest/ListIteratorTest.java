package UnitTesting_Exercises.src.test.java.p03_IteratorTest;

import UnitTesting_Exercises.src.main.java.p03_IteratorTest.ListIterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.awt.*;

public class ListIteratorTest {

    ListIterator listIterator;
    private static final String[] NAMES = new String[]{"Ivan","Georgi","Stoyan","Pesho"};

    @Before
    public void prepare() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("Ivan","Georgi","Stoyan","Pesho");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowException() throws OperationNotSupportedException{
       ListIterator listIterator = new ListIterator( null);
    }

    @Test
    public void testConstructorShouldCreateListIterator() throws OperationNotSupportedException{
        ListIterator listIterator = new ListIterator("Ivan","Georgi","Stoyan","Pesho");
    }

    @Test
    public void hasNext() throws OperationNotSupportedException{
        ListIterator listIterator = new ListIterator("Ivan","Georgi","Stoyan","Pesho");
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertFalse(listIterator.hasNext());
        listIterator.move();

    }

    @Test
    public void hasMove()throws OperationNotSupportedException{
        ListIterator listIterator = new ListIterator("Ivan","Georgi","Stoyan","Pesho");
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertFalse(listIterator.move());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintShouldThrowExceptionForEmptyList() throws OperationNotSupportedException {
       listIterator = new ListIterator();
       listIterator.print();
    }

    @Test
    public void testPrintSuccess()throws OperationNotSupportedException{
        ListIterator listIterator = new ListIterator("Ivan","Georgi","Stoyan","Pesho");
        int index = 0;
        while(listIterator.hasNext()){
            Assert.assertEquals(NAMES[index],listIterator.print());
            index++;
            listIterator.move();
        }
    }
}
