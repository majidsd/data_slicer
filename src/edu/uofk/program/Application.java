/**
 * 
 */
package edu.uofk.program;

import edu.uofk.logic.ReadFileDataBySize;

/**
 * @author MaJiD
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String filePath = "raw_data.txt";
		int bulkSize = 80; // Number of elements to be seleced per time
		
		ReadFileDataBySize readFileDataBySize = new ReadFileDataBySize();
		readFileDataBySize.readDataOfFileBySize(filePath, bulkSize);
		
	}

}
