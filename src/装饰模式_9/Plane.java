package 装饰模式_9;

public class Plane extends Decorator {

	public Plane(Transformer tf) {
		super(tf);
	}
	public void operation(){
		super.operation();
		fly();
	}
	public void fly(){
		System.out.println("变形金刚为飞机状态，除了能够在陆地上移动之外，还可以在天空中飞翔！！！");
	}
	
}
