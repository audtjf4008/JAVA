package operator;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("ù ��° ����");
		a = sc.nextInt();
		System.out.print("�� ��° ����");
		b = sc.nextInt();
		
		//System.out.printf("%d < %d = %s\n", a, b, (a<b));
		//printf�� ������ ����� ���� %s�� �̿��ϸ� �˴ϴ�.
		System.out.println(a + " < " + b + " => " + (a<b));
		System.out.println(a + " <= " + b + " => " + (a<=b));
		System.out.println(a + " > " + b + " => " + (a>b));
		System.out.println(a + " >= " + b + " => " + (a>=b));
		System.out.println(a + " == " + b + " => " + (a==b));
		System.out.println(a + " != " + b + " => " + (a!=b));
		
	}

}
