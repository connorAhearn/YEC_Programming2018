package main;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Writer {

	private String path;
	private boolean append = false;
	
	public Writer (String filePath, boolean appendVal)
	{
		path = filePath;
		append = appendVal;
	}
	
	public void write (String text)throws IOException 
	{
		FileWriter write = new FileWriter (path, append);
		PrintWriter print = new PrintWriter(write);
		print.printf("%s" + "%n", text );
		print.close();
	}
}	

