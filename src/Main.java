import game.HangmanGame;
import util.HangmanDictionary;


/**
 * This class launches the Hangman game and plays once.
 * 
 * @author Michael Hewner
 * @author Mac Mason
 * @author Robert C. Duvall
 * @author Shannon Duvall
 */
public class Main {
    public static final String DICTIONARY = "data/lowerwords.txt";
    public static final int NUM_LETTERS = 6;
    public static final int NUM_MISSES = 8;


    public static void main (String[] args) {
    	new HangmanGame(new HangmanDictionary(DICTIONARY), NUM_LETTERS, NUM_MISSES).play();
    }
}
