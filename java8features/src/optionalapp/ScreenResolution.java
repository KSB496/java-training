package optionalapp;

public class ScreenResolution {

	private int width;
	private int height;
	private int megaPixels;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getMegaPixels() {
		return megaPixels;
	}
	public void setMegaPixels(int megaPixels) {
		this.megaPixels = megaPixels;
	}
	public ScreenResolution(int width, int height, int megaPixels) {
		super();
		this.width = width;
		this.height = height;
		this.megaPixels = megaPixels;
	}
	
}
