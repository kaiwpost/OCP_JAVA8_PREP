package org.sbpdiscovery.java.nio2;


import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;

/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class PathsTest {

	public static void main(String[] args) {
	
		
		Path path1 = Paths.get("Files/abc.txt");
		Path path2 = Paths.get("/", "Files", "abc.txt");
		
		System.out.println(path1.isAbsolute());
		System.out.println(path2.isAbsolute());
		
		try {
			FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
			System.out.println(fileSystem.toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

}
