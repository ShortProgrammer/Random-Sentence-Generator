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
	
	public void sentence(int lengthOfSentence) {
		
		for(int i = 0; i < lengthOfSentence; i++) {
			randomNumber();
			if(lengthOfSentence != i+1) { //Not the end of the sentence
				String word = wordList.get(randomNumber);
				
				if(i == 0) { //Uppercasing the first word, ex: from "the bird is the word." to "The bird is the word."
					word = word.substring(0,1).toUpperCase() + word.substring(1);
					System.out.print(word + " ");
				}
				else {
					System.out.print(word + " ");
				}
			}
			else { //End of sentence
				String word = wordList.get(randomNumber);
				System.out.print(word);
				System.out.print(".");
				System.out.println();
			}
		}
	}

}
