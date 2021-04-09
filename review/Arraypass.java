package review;

import java.util.Scanner;

public class Arraypass {
	static int sum(int x[]) {
		int hap = 0;
		for(int i = 0; i < x.length; i++)
			hap += x[i];
		return hap;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int intArray[] = new int[5];
		int intArray2[] = new int[3];
		for(int i = 0; i < intArray.length; i++)
			intArray[i] = scn.nextInt();
		System.out.println("배열의 합 =" + sum(intArray));
		for(int i = 0; i < intArray2.length; i++)
			intArray2[i] = scn.nextInt();
		System.out.println("배열의 합 =" + sum(intArray2));
		scn.close();

	}

}
