package com.java.eight.features;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadingIOSamples {
	
	public static void main(String[] args) throws IOException, URISyntaxException {
	
		Path filePath = Paths.get("resources", "input.txt");
		try (Stream<String> lines = Files.lines(filePath)) {
			lines.forEach(s -> System.out.println(s));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
