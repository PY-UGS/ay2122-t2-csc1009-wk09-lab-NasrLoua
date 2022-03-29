

public class Main {

    public static void main(String[] args){
        RandomCharacter rc = new RandomCharacter();

        System.out.println("Getting a random lower case letter: ");
        for (int i = 0; i < 15; i++){
            System.out.println(rc.getRandomLowerCaseLetter());
        }

        System.out.println("\nGetting a random upper case letter: ");
        for (int j = 0; j < 15; j++){
            System.out.println(rc.getRandomUpperCaseLetter());
        }

        System.out.println("\nGetting a random digit character from 0 to 9: ");
        for (int k = 0; k < 15; k++){
            System.out.println(rc.getRandomDigitCharacter());
        }

        System.out.println("\nGetting a random character: ");
        for (int f = 0; f < 15; f++){
            System.out.println(rc.getRandomCharacter());
        }

    }
    
}
