package java_programming_exam1;

import java.io.IOException;
import java_programming_exam1.ConsoleFunctions.ReadFromConsole;
import java_programming_exam1.FileFunctions.CheckTypeOfFile;
import java_programming_exam1.PrintFunctions.Header;
import java_programming_exam1.PrintFunctions.PrintResult;

/**
 * App name:  	 Java Programming exam Problem 1
 * Description:  Java exam for Commviva
 * Version:      1.0.0
 * Author:       Alimenti Bel Traian <traian.alimentibel@gmail.com>
 */
public class App {
	
    public static void main( String[] args ) {
    	
		String path;
		Boolean correctselect=false; //is false until user choose a valid file
		ReadFromConsole rc = new ReadFromConsole(); //start reading by console
		
		Header.printHeader("1");
		
		while (!correctselect) {
			path = rc.choosefile();
			path = path.trim(); //remove white spaces at the beginning and end
			
			if ( ! (path.isEmpty())) { //if user did not enter only blank spaces
				
				try {
					if (CheckTypeOfFile.check(path)) {  //return true if the file is plain text
						PrintResult.print(path); //method that print the result
						correctselect = true; //in order to end while
					}
					else 
						System.out.println("It only allows plaint text files as input file.\n");
				} catch (IOException e) {
					System.out.println ("File not found. ");
				}
			}
		}
    }
}