

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CatTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CatTest
{
    /**
     * Default constructor for test class CatTest
     */
    public CatTest()
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
        String expected = "Meow meow!";
        Cat cat = new Cat("Fido", 2);
        Animal tester = cat;
        String actual = tester.makeSound();
        assertEquals(expected, actual, "makeSound() for Cat class failed. Did not get expected result.");
        
    }
    
        @Test
    public void testJump(){
        boolean expected = false;
        boolean actual = true;
        Cat cat = new Cat("Fido", 3);
        Bird bird = new Bird("Peppy", 5);
        Animal tester = bird;
        String sound = "";
        
        try{
            sound = ((Cat)tester).jump();
        }
        catch(Exception e){
            actual = false;
        }
        assertEquals(expected, actual, "jump() for Bird class failed. Exception should have been thrown");
    }
}
