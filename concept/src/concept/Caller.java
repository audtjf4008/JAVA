package concept;

public class Caller {
	public static void main(String[] args) {
		Basic rect = new Basic();
		rect.setHeight(10);
		rect.setWidth(20);
		
		System.out.println("사각형의 높이 ="+rect.getHeight());
		System.out.println("사각형의 너비 ="+rect.getWidth());
		System.out.println(rect);
	}
}
