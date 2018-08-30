package utils;
import simulator.Map;

import java.io.*;

public class MapIOProcessor {
	
	/* 
	 * Reads input text file from storage that uses binary to indicate if a cell on the arena is an obstacle.
	 * */
	public static void read(String filename, Map map) {
		try {
			InputStream in = new FileInputStream("arenas/" + filename + ".txt");
			BufferedReader bf = new BufferedReader(new InputStreamReader(in));
			
			StringBuilder sb = new StringBuilder();
			while (bf.readLine() != null) {
				sb.append(bf.readLine());
			}
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
}
