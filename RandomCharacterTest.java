

import static org.junit.Assert.*;
import org.junit.Test;

public class RandomCharacterTest {

    RandomCharacter rc = new RandomCharacter();



    // Test to check if it returns a lowercase letter
    @Test
    public void testRandomLowerCase(){
        for (int i = 0; i < 15; i++){
            assertTrue(Character.isLowerCase(rc.getRandomLowerCaseLetter()));
        }
    }

    // Test to check if it returns a uppercase letter
    @Test
    public void testRandomUpperCase(){
        for (int i = 0; i < 15; i++){
            assertTrue(Character.isUpperCase(rc.getRandomUpperCaseLetter()));
        }
    }

    // Test to check if it returns a digit between 0-9
    @Test
    public void testRandomDigitChar(){
        for (int i = 0; i < 15; i++){
            int num = rc.getRandomDigitCharacter();
            assertTrue(num <=9 && num >=0);
        }
    }

    // Test to check if it returns a random character
    @Test
    public void testRandomCharacter(){
        for (int i = 0; i < 15; i++){
            assertTrue(Character.isLetterOrDigit(rc.getRandomCharacter()));
        }
    }

     //Test to check if randomly generated number is a prime number
    @Test
    public void getPrimeNumber(){
        int num = rc.getRandomCharacter();
        for (int i = 0; i < 15; i++){
            assertTrue(rc.isPrime(num));
        }
    }
 
}
