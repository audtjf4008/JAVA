package concept;

public class Caller {
	public static void main(String[] args) {
		Basic rect = new Basic();
		rect.setHeight(10);
		rect.setWidth(20);
		
		System.out.println("�簢���� ���� ="+rect.getHeight());
		System.out.println("�簢���� �ʺ� ="+rect.getWidth());
		System.out.println(rect);
	}
}
