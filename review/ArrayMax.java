package review;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int max = -2147483648;
		int min = 2147483647;
		int sum = 0;
		double avg;
		
		int intArray[] = new int[5];
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scn.nextInt();
			sum += intArray[i];
			if (intArray[i] > max)
				max = intArray[i];
			if (intArray[i] < min)
				max = intArray[i];
		}
		avg = (double)sum / intArray.length;
		System.out.print("배열의 원소 =");
		for(int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i]);
		
		System.out.println();
		System.out.println("합="+sum+"평균="+avg);
		System.out.println("최대값="+max+",최소값="+min);
		scn.close();		

	}

}
