import java.io.*;
import java.util.*;

public class Generator {

	private int randomNumber;
	private int size;
	private ArrayList<String> wordList;
	
	public Generator() {
		//Save info from Words
		File file = new File(".\\src\\Words");
        Scanner inputStream = null;
        wordList = new ArrayList<String>();
        
		try {
			inputStream = new Scanner(new FileInputStream(file));
        }
        catch(FileNotFoundException e) {
            System.out.println("The file you entered was not found");
            System.out.println("or could not be opened.");
            System.exit(0);
        }
		
		String line = null;
        
        //Counts the number of lines, words, and characters
        while(inputStream.hasNextLine()) {
            try {
                line = inputStream.nextLine();
                wordList.add(line);
                size++;
            }
            catch(InputMismatchException e) {
                System.out.println("There is a problem.");
            }
        }
        inputStream.close();
	}
	
	public void randomNumber() {
		//Gets random number
		Random ran = new Random();
		randomNumber = ran.nextInt(size);
	}
	
	public void sentence() {
		String word = wordList.get(randomNumber);
		System.out.println(word);
	}

}
