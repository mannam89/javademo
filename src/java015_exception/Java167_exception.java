package java015_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java167_exception {
	public static void main(String[] args) {
		String line = null;
		
		try(FileReader fr = new FileReader("sample.txt");
				BufferedReader br = new BufferedReader(fr);){
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}

		}catch(IOException ex) {
			System.out.println(ex.toString());
			   
		}
		
	}

}
