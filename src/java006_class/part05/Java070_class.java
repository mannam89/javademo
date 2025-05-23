package java006_class.part05;

public class Java070_class {

	public static void main(String[] args) {
		MemberVar mv = new MemberVar();
		System.out.printf("var_byte:%d\n", mv.var_byte);
		System.out.printf("var_short:%d\n", mv.var_short);
		System.out.printf("var_int:%d\n", mv.var_int);
		System.out.printf("var_long:%d\n", mv.var_long);
		
		System.out.printf("var_float:%.1f\n", mv.var_float);
		System.out.printf("var_double:%.1f\n", mv.var_double);
		
		System.out.printf("var_boolean:%b\n",mv.var_boolean);
		System.out.printf("var_char:%c\n",mv.var_char);
		
		System.out.printf("var_String:%s\n",mv.var_String);
		System.out.printf("var_arr:%d\n",mv.var_arr);
		
		//지역변수(local variable)은 개발자가 직접 초기화하지 않고 호출하면 오류가 발생한다.
		int num;
		

		
		
	}

}
