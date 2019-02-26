import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MathTests {
    private Math math;

    @BeforeMethod
    public void setUp() {
        math = new Math();
    }

    @Test
    public void add_TwoPlusTwo_ReturnsFor() {
        /* Arrange
         *     consists of a few lines of code that are used to declare

         *      initialize the objects we need in our test.  */
        final int expected = 4;
        /* Act
         *     perform the actions,

         *     whether it is some calculation or modify the state of our objects  */
        final int actual = Math.add(2, 2);
        /* Assert
         *      verify that the outcome of the Act part were made successfully */
        Assert.assertEquals(actual, expected);
    /*
    If first assert fails, below this code, other tests will be skipped
    */
    }

    @Test
    public void divide_TenDividedByFive_ReturnsTwo() {
        final double expected = 2.0;
        final double actual = Math.divide(10, 5);

        Assert.assertEquals(actual, expected);

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divide_TenDividedByZero_ThrowsIllegalArgumentException() {
        //Expecting illegal argument. If we change to zero to one, test will be failed.
        Math.divide(10, 0);
    }

    @AfterMethod
    public void tearDown() {
        //set math object to null with tearDown.
        math = null;
    }
}
