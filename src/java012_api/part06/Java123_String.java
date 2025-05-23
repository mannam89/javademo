package java012_api.part06;

public class Java123_String {
	public static void main(String[] args) {
		String sn="korea";
		char[] data=reverse(sn);
		System.out.println(sn);
		System.out.println(data);
		System.out.println(sn);
	}
	
	public static char[] reverse(String alpa) {
		
		char[] arr=new char[alpa.length()];
		for(int i =0;i<arr.length;i++) {
			arr[i]=alpa.charAt(arr.length-1-i);
		}
		return arr;
		
	}

}