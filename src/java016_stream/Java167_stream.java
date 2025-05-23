package java016_stream;

import java.io.IOException;
import java.io.InputStream;

public class Java167_stream {

	public static void main(String[] args) {
		System.out.print("데이터 입력:");
		
		InputStream is = System.in;
		
		try {
			// read() 한바이트를 읽어와 유니코드로 리턴한다.
			int line = is.read();
			System.out.println((char)line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//end main()

}//end class
