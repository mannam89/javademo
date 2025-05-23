package java012_api.part06;

public class Java122_String {
	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		
		int index=sn.indexOf(":");
		System.out.println("ip:" + sn.substring(0, index));
		System.out.println("port:" + sn.substring(index+1));

		System.out.println("===========================");
		String[] arr = sn.split(":");
		System.out.printf("ip:%s\n", arr[0]);
		System.out.printf("port:%s\n", arr[1]);
	}
}
