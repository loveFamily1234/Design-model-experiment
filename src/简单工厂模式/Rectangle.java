package 简单工厂模式;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("绘制一个矩形！");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub

		System.out.println("擦除一个矩形！");
	}

}
