package concept;

public class Basic {
	private int height;
	private int width;
	private String name;	
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}	
	public int area(int height, int width) {
		return height * width;
	}
}
