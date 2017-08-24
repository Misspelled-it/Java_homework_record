package test.javapro;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
public class WordRemover {
	public static int removeWord(File f, String newFileName, String wordToBeRemoved) throws IOException, IllegalStateException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		File newFile = new File(newFileName);
		newFile.createNewFile();
		try {
			inputStream = new FileReader(f);
			outputStream = new FileWriter(newFile);
			Scanner scanner = new Scanner(inputStream);
			while(scanner.hasNext()) {
				String next = scanner.nextLine();
				if(next.contains(wordToBeRemoved)) {
					next = next.replaceAll(wordToBeRemoved, "");
				}
				outputStream.write(next);
			}
			scanner.close();
					
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalStateException e){
			e.printStackTrace();	
		} finally {

			if(inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
		
		return (int)newFile.length();
		
	}

}
