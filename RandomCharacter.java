
import java.util.Random;



public class RandomCharacter {

    Random random = new Random();

    private char lowerCaseLetter;
    private char upperCaseLetter;
    private int randomDigit;
    
    public char getRandomLowerCaseLetter() {
        //generates a lower case letter at random, type cast to char from int
        this.lowerCaseLetter = (char)('a' + random.nextInt(26));
        return this.lowerCaseLetter;
    }

    public char getRandomUpperCaseLetter() {
        //generates an upper case letter at random, type cast to char from int
        this.upperCaseLetter = (char)('A' + random.nextInt(26));
        return this.upperCaseLetter;
    }

    public int getRandomDigitCharacter() {
        //generates a random digit from 0 to 9, type cast into char
        this.randomDigit = random.nextInt(0,10); 
        return (char)this.randomDigit;
    }

    public char getRandomCharacter() {
        String alphaNumericString = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // generates a random number that represents index of the string
        int randomNum = random.nextInt(alphaNumericString.length());
        // return the character based on randomNum
        return alphaNumericString.charAt(randomNum);
    }

    public boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }

        }
        return true;

    }
    
}
