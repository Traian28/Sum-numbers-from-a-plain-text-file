package java_programming_exam1.PrintFunctions;

import java_programming_exam1.FileFunctions.ReadFile;

import java.io.FileNotFoundException;
import java.util.Iterator;

/**
 * Class Print Result
 * Description : Print the final result from Iterator given by ReadFile.read method 
 * @package org.apache.maven.java_programming_exam
 */
public class PrintResult {
	
	public static float print(String path) {
		
		Float total = (float) 0.0;
		Number element = 0.0;
		
	    try {
	    	Iterator<Number> res= ReadFile.read(path);
	    	
	    	if (!res.hasNext())
	    		System.out.println("No numbers detected on file.\n");
	    	else {
	    		System.out.print("Total amount: ");
	    		
			    while (res.hasNext()) {
			    	element = (Number)res.next();
			    	total = element.floatValue()+total;
			 
			    	if (res.hasNext()) {
			    		System.out.print(element+" + ");
			    	}
			    	else System.out.print(element+" = "+total);	
			    }
	    	}
		}
	    catch (FileNotFoundException e) {	
	    	System.out.println("File not found.");
	    }
		return total;
	}
}