package org.sbpdiscovery.java.io;


import java.io.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class TestIO {

	public static void main(String[] args) {

		File file = new File("Files/abc.txt");
		
		System.out.println(file.exists());
		
		InputStream is = null;
		
		try {
			
			is =
				new BufferedInputStream(
					new FileInputStream(
						file));
			
			System.out.println((char) is.read());
			System.out.println((char) is.read());
			if(is.markSupported()) {
				is.mark(100);	// Mark position in stream with read-ahead limit.
				System.out.println((char) is.read());
				System.out.println((char) is.read());
				is.reset();		// Resets stream back to mark. Does NOT work with all InputStreams.
			}
			System.out.println((char) is.read());
			System.out.println((char) is.read());
			is.skip(2);		// Skips over 2 bytes.
			System.out.println((char) is.read());
			int b;
			while((b = is.read()) != -1) {
				System.out.println((char) b);
			}
			
			System.out.format("Steaks are very tasty!");
			System.out.print("Steaks are very tasty!");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
