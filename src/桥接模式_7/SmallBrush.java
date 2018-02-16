package 桥接模式_7;

public class SmallBrush extends AbstractBrush {

	public void draw(){
		color.getColor();
		System.out.println("小号毛笔绘图！！！");
		
	}
}
