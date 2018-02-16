package ге╫сдёй╫_7;

public class Main {
	public static void main(String[] args) {
		Color1 color1 = new Color1();
		Color2 color2 = new Color2();
		Color3 color3 = new Color3();
		Color4 color4 = new Color4();
		Color5 color5 = new Color5();
		AbstractBrush abstractBrush1 = new LargeBrush();
		AbstractBrush abstractBrush2 = new MiddleBrush();
		AbstractBrush abstractBrush3 = new SmallBrush();
		System.out.println("-------------------------------------------------------------------------");
		abstractBrush1.setBrushColor(color1);
		abstractBrush1.draw();
		abstractBrush1.setBrushColor(color2);
		abstractBrush1.draw();
		abstractBrush1.setBrushColor(color3);
		abstractBrush1.draw();
		abstractBrush1.setBrushColor(color4);
		abstractBrush1.draw();
		abstractBrush1.setBrushColor(color5);
		abstractBrush1.draw();
		System.out.println("-------------------------------------------------------------------------");
		abstractBrush2.setBrushColor(color1);
		abstractBrush2.draw();
		abstractBrush2.setBrushColor(color2);
		abstractBrush2.draw();
		abstractBrush2.setBrushColor(color3);
		abstractBrush2.draw();
		abstractBrush2.setBrushColor(color4);
		abstractBrush2.draw();
		abstractBrush2.setBrushColor(color5);
		abstractBrush2.draw();
		System.out.println("-------------------------------------------------------------------------");
		abstractBrush3.setBrushColor(color1);
		abstractBrush3.draw();
		abstractBrush3.setBrushColor(color2);
		abstractBrush3.draw();
		abstractBrush3.setBrushColor(color3);
		abstractBrush3.draw();
		abstractBrush3.setBrushColor(color4);
		abstractBrush3.draw();
		abstractBrush3.setBrushColor(color5);
		abstractBrush3.draw();
	}
}
