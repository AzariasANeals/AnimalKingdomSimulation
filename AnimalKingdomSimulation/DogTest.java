

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DogTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DogTest
{
    /**
     * Default constructor for test class DogTest
     */
    public DogTest()
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
        String expected = "Woof woof!";
        Dog dog = new Dog("Rover", 4);
        Animal tester = dog;
        String actual = tester.makeSound();
        
        assertEquals(expected, actual, "makeSound() for Dog class failed. Did not get expected return.");
    }
    
    @Test
    public void testChase(){
        boolean expected = false;
        boolean actual = true;
        Cat cat = new Cat("Fido", 3);
        Dog dog = new Dog("Rover", 4);
        Animal tester = cat;
        String sound = "";
        try{
            sound = ((Dog)tester).chase();
        }
        catch(Exception e){
            actual = false;
        }
        assertEquals(expected, actual, "chase() for Dog class failed. Exception should have been thrown.");
    }
    
}
