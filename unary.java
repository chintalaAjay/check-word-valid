
public class unary {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=a++ + b-- + ++a - --b +a++;
		a=--a + --b + a++ - b++ + ++a + c++;
		b=a++ - ++b + ++c + a++ - b-- + ++c;
		a=a++ + b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
}
