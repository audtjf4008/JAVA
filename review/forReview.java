package review;

public class forReview {

	public static void main(String[] args) {
		int i, sum = 10;
		
		for(i=1; i<=10; i++) {
			sum += 1;
			System.out.print(i);			
			if(i<=9)
				System.out.print("+");
			else
				System.out.print("=");
		}
		System.out.print(sum);

	}

}
