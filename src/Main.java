import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Need from the user:
		//Size of the sentence
		//Number of sentences
		
		//Maybe later have it so there is a random length for the sentences.
		
		//To Do once Size and Number of sentences is gotten:
		//Send to Generator
		//Get sentence(s) from Generator
		//Display sentence
		//Ask if user wants to do it again
		Scanner input = new Scanner(System.in);
		Generator generator = new Generator();
		
		System.out.println("Please enter the length of the sentences:");
		int length = input.nextInt();
		
		System.out.println("Please enter the number of sentences:");
		int number = input.nextInt();
		
		for(int i = 0; i < number; i++) {
			//generator.sentence(int lengthOfSentence)
			generator.sentence(length);
		}
	}

}
