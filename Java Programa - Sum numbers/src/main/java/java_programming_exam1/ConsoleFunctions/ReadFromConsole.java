package java_programming_exam1.ConsoleFunctions;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 * Class ReadFromConsole
 * Description : Ask for path to a plain text file and return it
 * @package org.apache.maven.java_programming_exam
 */
public class ReadFromConsole extends JFrame {

	private static final long serialVersionUID = 1L;
	private Scanner keyboard;

	public String choosefile() { 
		
		String path ="";
		boolean getfile=false; //boolean variable to know if the user choose a file or not
		keyboard = new Scanner(System.in);
			
		while (! getfile) {
			System.out.print("Type the path of text file or press enter to open explorer: ");
			path = keyboard.nextLine();
		
			if (path.isEmpty()) { //user press enter so open explorer
					JFileChooser file=new JFileChooser();
					int aux = file.showOpenDialog(this); //show explorer
					
					if (aux == JFileChooser.APPROVE_OPTION) { 			
						File text=file.getSelectedFile(); //open selected file
						path = text.getAbsolutePath(); //get the path of the file to return it
						getfile=true; //the user choose a file so the program must continue
						System.out.println("Selected path: "+path);
					}
			} else
				getfile = true;
		}
			
		return path;
	}
}
