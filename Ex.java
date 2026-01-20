public class Ex {
	int x;
	int y;
	public Ex(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x =x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Ex e = (Ex) obj;
		return this.x - e.x ;
		

	}

	
	@Override
	public String toString() {
		return "Ex [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
