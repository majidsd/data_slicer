/**
 * 
 */
package edu.uofk.logic;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author MaJiD
 *
 */
public class ReadFileDataBySize {
	
	public void readDataOfFileBySize(String filePath, int bulkSize) {
		Path path = Paths.get(filePath);
		try {
			
			byte[] fileContents =  Files.readAllBytes(path);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			for (byte b : fileContents)
			    if (b != 10 && b != 13)
			        baos.write(b);
			
			byte[] filteredContents = baos.toByteArray();
			
			int size = filteredContents.length;
			System.out.println("Number of element in the data is : " + size);
			System.out.println("Started the reading...");
			
			String sub = "";
			for(int i=0; i < size; i++) {
				if(i%bulkSize == 0 && i != 0) {
					System.out.println(sub);
					sub = "";
				} else if((size - i) < bulkSize && (size - i - 1) == 0) {
					sub += Character.toString ((char) filteredContents[i]);
					System.out.println(sub);
					sub = "";
				}
				sub += Character.toString ((char) filteredContents[i]);
			}
			System.out.println("Finished the reading...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
