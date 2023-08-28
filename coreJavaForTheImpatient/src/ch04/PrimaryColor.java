package ch04;
public enum PrimaryColor {
	BLACK(0, 0, 0), RED(255, 0, 0), BLUE(0, 0, 255),
	GREEN(0, 255, 0), CYAN(0, 255, 255), MAGENTA(255, 0, 255), 
	YELLOW(255, 255, 0), WHITE(255, 255, 255);
	
	int red;
	int green;
	int blue;
	
	PrimaryColor(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}
	
	public int getRed(){
		return red;
	}
	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
}
