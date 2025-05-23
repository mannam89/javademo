package java001_basic;

public class on {

	public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Without parentheses, precedence is applied
        boolean result = a || b && c;

        System.out.printf("Result without parentheses: %b\n", result);

        // Explicit parentheses to override precedence
        boolean resultWithParentheses = (a || b) && c;

        System.out.printf("Result with parentheses: %b\n", resultWithParentheses);
    }

	}
