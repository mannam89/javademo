package java015_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java164_exception {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file);
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			System.out.println(fr.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
