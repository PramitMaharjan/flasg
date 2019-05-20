package destiny4;

import java.util.Scanner;

public class Appsc {
	public static void main(String[] args) {
		
		//Create scanner object
Scanner input = new Scanner(System.in);

//output the prompt
System.out.println("Enter the line of text; ");
//wait for the user to enter a line of text
String line = input.nextLine();

//Tell the what they entered
System.out.println("you entered: "+ line);
	}

}
