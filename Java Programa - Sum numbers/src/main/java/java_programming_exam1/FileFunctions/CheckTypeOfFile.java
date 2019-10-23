package java_programming_exam1.FileFunctions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


/**
 * Class CheckTypeOfFile
 * Description : Check whether the file of the path is a plain text or not
 * @package org.apache.maven.java_programming_exam
 */
public class CheckTypeOfFile {
	
	public static boolean check (String path) throws IOException {
		
		boolean ok = false;
				
		if (new File(path).exists()) {
			Path file = new File(path).toPath();
			String ext = Files.probeContentType(file);
			
			if (! (ext == null) )
				if ( ext.equals("text/plain") ) 
					ok = true;
		}
		
		return ok; //return true if file type is plain text, if not return false
	}
}