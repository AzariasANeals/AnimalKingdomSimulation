

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BirdTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BirdTest
{
    /**
     * Default constructor for test class BirdTest
     */
    public BirdTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testMakeSound(){
        String expected = "Chirp chirp!";
        Bird bird = new Bird("Peppy", 5);
        Animal tester = bird;
        String actual = tester.makeSound();
        assertEquals(expected, actual, "makeSound() for Bird class failed. Did not get expected return");
    }
    
    @Test
    public void testFly(){
        boolean expected = false;
        boolean actual = true;
        Cat cat = new Cat("Fido", 3);
        Bird bird = new Bird("Peppy", 5);
        Animal tester = cat;
        String sound = "";
        
        try{
            sound = ((Bird)tester).fly();
        }
        catch(Exception e){
            actual = false;
        }
        assertEquals(expected, actual, "fly() for Bird class failed. Exception should have been thrown");
    }
}
