import java.io.IOException;

public class MainMethodTest {

	public static void main(String[] args) throws IOException {
		FileReader test = new FileReader("~/Desktop/test.txt", false);
		
		test.write("wow");
		test.write("wow");
	}
}
