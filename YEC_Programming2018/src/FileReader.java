import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	private String path;
	private boolean append = false;

	public FileReader(String filePath, boolean appendVal) {
		path = filePath;
		append = appendVal;
	}

	public void write(String text) throws IOException {
		FileWriter write = new FileWriter(path, append);
		PrintWriter print = new PrintWriter(write);
		print.printf("%s" + "%n", text);
		print.close();
	}
}
