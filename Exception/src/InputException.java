import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0, n=0;
		System.out.println("3���� ������ �Է��ϼ���");
		for(int i = 0; i < 3; i++) 
		{
			System.out.print(i + ">>");
			try {
			n = scn.nextInt();
			} catch (InputMismatchException e) {
				scn.next();
				System.out.println("������ �ƴմϴ�. ���� �Է� �ٶ��ϴ�");
				i--;
				continue;
			}
			
			sum += n;
		}
		System.out.println("��"+sum);
		scn.close();
	}

}
