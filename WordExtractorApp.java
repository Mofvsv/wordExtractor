
/**
 * Write a description of class WordExtractorApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordExtractorApp
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WordExtractorApp
     */
    public WordExtractorApp()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public static void main(String[] args) {

		String sent = JOptionPane.showInputDialog("Enter at least 4 words");
		WordExtractor wE1 = new WordExtractor(sent);

		// Write the first word to the console window.
		System.out.println("first word: " + wE1.getFirst());

		// Reset the sentence
		wE1.setSentence(wE1.getRest());

		// Write the second word to the console window.
		System.out.println("second word: " + wE1.getFirst());

		// Reset the Sentence
		wE1.setSentence(wE1.getRest());

		// Write the third word to the console window.
		System.out.println("third word: " + wE1.getFirst());

		// Write the rest of the sentence to the console window.
		System.out.println("rest of sentence: " +wE1.getRest());
	}
}
