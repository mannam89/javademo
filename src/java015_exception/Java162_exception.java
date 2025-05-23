package java015_exception;

public class Java162_exception {
	public static void main(String[] args) {
		String data1 = "8";
		String data2 = "a";
		
		try {
		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2);
		int res =x/y;
		System.out.println(res);
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}catch(RuntimeException ex) {
			System.out.println(ex.toString());
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
	}

}
