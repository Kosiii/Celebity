
import java.util.ArrayList;
import java.util.Scanner;

public class CelebrityGuessingGame {

    public static ArrayList<Celebrity> celebrities = new ArrayList<Celebrity>();

    public static void addCelebrity(Celebrity c) {
        celebrities.add(c);
    }

    public static void printCelebrityTraits(Celebrity c) {
        System.out.println("Gender: " + c.getGender());
        System.out.println("age: " + c.getAge());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Weight: " + c.getWeight());
        System.out.println("Profession: " + c.getProfession());
        System.out.println("Initals: " + c.getInitals());
        System.out.println("Hair_color: " + c.getHaircolor());
        System.out.println("Skin_color: " + c.getSkincolor());
    }

    public static boolean isGuessCorrect(Celebrity c, String guess) {
        return guess.equalsIgnoreCase(c.getName());
    }

    public static void submitAnswer(String answer) {
        // Here you can implement any logic for submitting the answer
        // such as checking if it matches any of the celebrities in the list
    }

    public static void main(String[] args) {
        
      Celebrity Lebron = new Celebrity("male", 38,"6foot8inches", 250, "Basketballplayer", "LBJ", "black", "Black");
            Celebrity Zion = new Celebrity("male", 22, "6foot6inches", 270, "Basketballplayer", "ZW", "black", "Black");
            Celebrity Ja_Morant = new Celebrity("male",23,"6foot2inches", 183, "Basketballplayer", "JM","black", "Black");
            Celebrity Micheal_B_Jordan = new Celebrity("male",35, "5foot11inches", 175, "Actor", "MJ","black", "Black");
            Celebrity Lil_Uzi_Vert = new Celebrity("male", 38, "5foot4inches", 150, "Rapper", "LUV", "Red", "Black" );
            Celebrity Chris_Pratt = new Celebrity("male", 43, "6foot2inches", 185, "Actor", "CP", "blonde", "White");
            Celebrity DrPhill = new Celebrity("male",72, "6foot3inches", 173, "Media_Personality", "DP", "grey","White");
            Celebrity Taylor_Swift = new Celebrity("Female", 33, "5foot11inches", 119, "Actor", "TS", "blonde", "White");

        // Add the celebrities to the ArrayList
        addCelebrity(Lebron);
        addCelebrity(Zion);
        addCelebrity(Ja_Morant);
        addCelebrity(Micheal_B_Jordan);
        addCelebrity(Lil_Uzi_Vert);
        addCelebrity(Chris_Pratt);
        addCelebrity(DrPhill);
        addCelebrity(Taylor_Swift);
        

        int numMisses = 0;
        int maxMisses = 3;
        Scanner scanner = new Scanner(System.in);

        while (numMisses < maxMisses) {
            // Here you can implement the game logic
            // such as prompting the user to guess a celebrity,
            // checking if the guess is correct, and keeping track
            // of the number of misses.
        }

        scanner.close();
    }
}
