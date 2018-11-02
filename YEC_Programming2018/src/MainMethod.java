package test;

import java.io.IOException;

import main.Writer;


public class MainMethod {
	
	public static void main(String[] args) throws IOException {
		Writer writer = new Writer("~/Desktop/test.txt", false);
		
		writer.write("Wow");
		writer.write("Wow\n");
		writer.write("Wow");
	}
}
