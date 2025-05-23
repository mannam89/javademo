package java013_api;

public class Java151_Wrapper {
	public static void main(String[] args) {
		char data = 'a';
		
		if(data>='a'&& data <='z')
			System.out.println((char)(data-32));
		
		System.out.println(Character.isLowerCase(data));
		System.out.println(Character.isUpperCase(data));
		System.out.println(Character.toUpperCase(data));
		System.out.println(Character.toLowerCase(data));
		System.out.println(Character.isDigit(data));
		System.out.println(Character.isAlphabetic(data));
		
		
		
		String text = "hEllo";
		char[] upc = text.toCharArray();
		for(int i = 0;i<upc.length;i++) {
			if(Character.isUpperCase(upc[i])) {
				upc[i] = Character.toLowerCase(upc[i]);
				
			}
		}
		System.out.println(upc);
			
	}

}
