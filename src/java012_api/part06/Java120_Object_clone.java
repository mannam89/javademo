package java012_api.part06;

import java.util.Arrays;

public class Java120_Object_clone {

	public static void main(String[] args) {
		Rect[] rect = new Rect[3];
		rect[0] = new Rect(2, 5);
		rect[1] = new Rect(1, 4);
		rect[2] = new Rect(3, 2);
		
		
		// Rect[] copy = rect;
		
		Rect[] copy = rect.clone();
		System.out.println(rect);
		System.out.println(copy);
		System.out.printf("%d %d\n",rect[0].width,rect[0].height);
		System.out.printf("%d %d\n",copy[0].width,copy[0].height);

		copy[0].width=100;
		copy[0].height=200;
		System.out.printf("%d %d\n",rect[0].width,rect[0].height);
		System.out.printf("%d %d\n",copy[0].width,copy[0].height);
		
		for(int i=0; i<copy.length; i++)
			copy[i] = copy[i].clone();
			
        rect[0] = new Rect(2, 6);
		System.out.println(Arrays.toString(rect));
		for (Rect r : rect)
			System.out.println(r.getArea());

		System.out.println(Arrays.toString(copy));
		for (Rect r : copy)
			System.out.println(r.getArea());		
	}
}
