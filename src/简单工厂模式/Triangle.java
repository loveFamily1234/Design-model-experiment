package 简单工厂模式;

public class Triangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("绘制一个三角形！");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub

		System.out.println("擦除一个三角形！");
	}

}
