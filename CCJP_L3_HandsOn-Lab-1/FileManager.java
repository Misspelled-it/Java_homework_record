package test.javapro;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileManager {
	public static int addData(File f, String data) throws IOException {
		FileWriter outputStream = null;
		try {
			outputStream = new FileWriter(f, true);
			outputStream.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (outputStream != null) {
				outputStream.close();
			}
		}
		return (int)f.length();
	}
}
