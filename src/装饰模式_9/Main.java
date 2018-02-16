package в╟йндёй╫_9;

public class Main {
	public static void main(String[] args) {
		Transformer tf1,tf2,tf3;
		tf1 = new Automobile();
		tf2 = new Robot(tf1);
		tf3 = new Plane(tf2);
		tf3.operation();
	}
}
