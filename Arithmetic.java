package operator;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("첫 번째 정수 :");
		a = sc.nextInt();
		System.out.print("두 번째 정수 :");
		b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.println(a + "-" + b + "=" + (a-b));
		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println(a + "/" + b + "=" + ((double)a/b));
		System.out.println(a + "%" + b + "=" + (a%b));

	}

}
