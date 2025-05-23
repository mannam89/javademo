package java012_api.part05;

import java.util.Arrays;

public class Java119_Object_clone {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] copy=arr;
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(copy);
		System.out.println(Arrays.toString(copy));
		
		System.out.println("===========================");
		
		int[] deepCopy = arr.clone();
		deepCopy[0]=10;
		System.out.println(deepCopy);
		System.out.println(Arrays.toString(deepCopy));
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}

}
