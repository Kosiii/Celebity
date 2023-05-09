
import java.util.ArrayList;
import java.util.Scanner;

public class CelebrityGuessingGame {
    private ArrayList<Celebrity> celebrities;
    private int numMisses;
    private int maxMisses;

    public CelebrityGuessingGame() {
        this.celebrities = new ArrayList<>();
        this.numMisses = 0;
        this.maxMisses = 5;
    }

    public void addCelebrity(Celebrity celebrity) {
        this.celebrities.add(celebrity);
    }

    public void printTraits(Celebrity celebrity) {
        System.out.println("Traits of " + celebrity.getName() + ":");
        System.out.println("Hair color: " + celebrity.getHairColor());
        System.out.println("Profession: " + celebrity.getProfession());
import java.util.ArrayList;
import java.util.Scanner;

public class CelebrityGuessingGame {

    public static ArrayList<Celebrity> celebrities = new ArrayList<Celebrity>();
import java.util.ArrayList;
import java.util.Scanner;

public class CelebrityGuessingGame {

    public static ArrayList<Celebrity> celebrities = new ArrayList<Celebrity>();

    public static void addCelebrity(Celebrity c) {
        celebrities.add(c);
    }

    public static void printCelebrityTraits(Celebrity c) {
        System.out.println("Name: " + c.getName());
        System.out.println("Hair Color: " + c.getHairColor());
        System.out.println("Profession: " + c.getProfession());
        System.out.println("Age: " + c.getAge());
        System.out.println("Nationality: " + c.getNationality());
    }

    public static boolean isGuessCorrect(Celebrity c, String guess) {
        return guess.equalsIgnoreCase(c.getName());
import java.util.ArrayList;
import java.util.Scanner;

public class CelebrityGuessingGame {

    public static ArrayList<Celebrity> celebrities = new ArrayList<Celebrity>();

    public static void addCelebrity(Celebrity c) {
        celebrities.add(c);
    }

    public static void printCelebrityTraits(Celebrity c) {
        System.out.println("Name: " + c.getName());
        System.out.println("Hair Color: " + c.getHairColor());
        System.out.println("Profession: " + c.getProfession());
        System.out.println("Age: " + c.getAge());
        System.out.println("Nationality: " + c.getNationality());
    }

    public static boolean isGuessCorrect(Celebrity c, String guess) {
        return guess.equalsIgnoreCase(c.getName());
    }

    public static void submitAnswer(String answer) {
        // Here you can implement any logic for submitting the answer
        // such as checking if it matches any of the celebrities in the list
    }

    public static void main(String[] args) {
        // Instantiate 10 different celebrity objects
        Celebrity c1 = new Celebrity("Angelina Jolie", "brunette", "actress", 46, "American");
        Celebrity c2 = new Celebrity("Beyonce", "blonde", "singer", 40, "American");
        Celebrity c3 = new Celebrity("Leonardo DiCaprio", "blonde", "actor", 47, "American");
        Celebrity c4 = new Celebrity("Scarlett Johansson", "blonde", "actress", 37, "American");
        Celebrity c5 = new Celebrity("David Beckham", "brown", "soccer player", 46, "English");
        Celebrity c6 = new Celebrity("Emma Watson", "brown", "actress", 31, "British");
        Celebrity c7 = new Celebrity("Drake", "black", "rapper", 35, "Canadian");
        Celebrity c8 = new Celebrity("Rihanna", "black", "singer", 33, "Barbadian");
        Celebrity c9 = new Celebrity("Cristiano Ronaldo", "brown", "soccer player", 36, "Portuguese");
        Celebrity c10 = new Celebrity("Kylie Jenner", "blonde", "businesswoman", 24, "American");

        // Add the celebrities to the ArrayList
        addCelebrity(c1);
        addCelebrity(c2);
        addCelebrity(c3);
        addCelebrity(c4);
        addCelebrity(c5);
        addCelebrity(c6);
        addCelebrity(c7);
        addCelebrity(c8);
        addCelebrity(c9);
        addCelebrity(c10);

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
