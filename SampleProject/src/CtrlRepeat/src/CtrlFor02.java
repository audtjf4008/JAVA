import java.util.Scanner;

public class CtrlFor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("���� :");
		n = sc.nextInt();
		
		
		int i, hap = 0;
		//break point
		for(i = 0; i<=100; i++) {
			hap += i; // hap = hap + 1;
		}
		System.out.println("0���� 100������ �� = "+hap+"�Դϴ�.");

	}

}
