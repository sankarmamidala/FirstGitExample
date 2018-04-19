import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputFileEx {

	 private String getFile(String fileName) {

			StringBuilder result = new StringBuilder("");

			//Get file from resources folder
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource(fileName).getFile());

			try (Scanner scanner = new Scanner(file)) {

				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					result.append(line).append("\n");
				}

				scanner.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

			return result.toString();

		  }

		
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputFileEx obj = new InputFileEx();
		System.out.println(obj.getFile("abc.txt"));

	}

}
