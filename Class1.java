package codewithbugs;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Class1 {
	
	public static void main(String args[]) {

		// Format string should use %n rather than \n
		int i = 5;
		System.out.printf("%d \n", i);

		// Method uses the same code for two branches
		if (i > 3)
			i = 1;
		else if (i < 3)
			i = 0;
		else
			i = 0;
		
	
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S = in.next();
        

		// Dead store to local variable (the created variable whose value is not used)
		int iii = 3;
		iii = iii;
		
		int var = 9;

		String str1 = "hi";
		String str2 = "hi";
		if (str1 != str2)
			str1 = "66";

     		// Useless object created
		ArrayList<Character> charArrLst = new ArrayList<>();
		String labels[] = { "young", "younger", "youngest" }; 
		
		
		
		Scanner inFile;

		try {
			inFile = new Scanner(new File("data.txt"));

		} catch (Exception e) {
			System.out.println("File not found: " + "data.txt");
		}
		System.exit(0);

	}

}

//Unread field 
class sub extends Class1 {
	final int jjj = 3;
	public final double pi = 3.14;

	public void method1() {
		if (jjj > 0)
			System.out.printf("\n");
		else if (jjj > 1)
			System.out.printf("\n\n");
	}
}
