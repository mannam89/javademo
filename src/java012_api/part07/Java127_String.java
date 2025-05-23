package java012_api.part07;
import java.util.StringJoiner;

public class Java127_String {
	public static void main(String[] args) {
		String color = "red,green,blue";
		String[] arr = color.split(",");
		String str = String.join("-", arr);
		System.out.println(color);
		System.out.println(str);

		StringJoiner sj = new StringJoiner(",", "[", "]");
		for(String data:arr)
			sj.add(data);
		System.out.println(sj);
		System.out.println(sj.length());
		

	}

}
