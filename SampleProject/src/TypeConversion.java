
public class TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int a = 100;
		
		System.out.println(b + a);
		System.out.println(10/4);
		System.out.println(10/4.0);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b + a));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
	}
}
