package 简单工厂模式;

public class UnsupportedShapeException {
	public UnsupportedShapeException(){
		System.out.println("无法画出该图形，抛出一个UnsupportedShapeException异常！！！");
	}
}
