package AssignmnetDayTwo_SecondQ;

public class square extends Shape {
	square() {}
	square(float s) {
		super.side = s;
	}
	@Override
	public void draw() {
		System.out.println("Drawing a Square...\nDrawing done with Side - " + side + "cm");
	}
	@Override
	public float calcArea() {
		return side * side;
	}
	public String toString() {
		draw();
		return "Area of Square - " + calcArea() + "cm\n\n";
	}
}