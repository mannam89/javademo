package java005_method;

public class Java057_method {

	public static void main(String[] args) {
		int x=4;
		int y=2;
		int z=5;
		System.out.println(hap(x,y,z));
		
		int[] num= {2,3};
		System.out.println(plus(num));
		
		int[] arr= {2,6,4,8};
		System.out.println(plus(arr));

	}
	
	public static void proc(int x, int y, int z) {
		System.out.println(x+y+z);
		
	}
	
	public static int hap(int x, int y, int z) {
		
		return x + y + z;
	}
	 
	public static int plus(int[] arr) {
		int sum=0;
		for(int i =0; i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
