package day55_abstraction;

public class Point extends Object {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "(Point: (" + this.x + ", " + this.y + ")";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Point) {
			Point p = (Point) obj;
			boolean result = (this.x == p.x && this.y == p.y);
			return result;
		}
		return false;
	}

}
