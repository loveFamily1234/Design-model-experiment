package 装饰模式_9;

public class Robot extends Decorator {

	public Robot(Transformer tf) {
		super(tf);
	}
	public void operation(){
		super.operation();
		speak();
	}
	public void speak(){
		System.out.println("变形金刚为机器人状态，除了能够在陆地上移动之外，还可以说话！！！");
	}
}
