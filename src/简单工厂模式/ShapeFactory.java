package 简单工厂模式;

import java.util.Scanner;

public class ShapeFactory {
	public ShapeFactory(int num){
		switch(num){
			case 1:
				new Circle().draw();
				break;
			case 2:
				new Circle().erase();
				break;
			case 3:
				new Rectangle().draw();
				break;
			case 4:
				new Rectangle().erase();
				break;
			case 5:
				new Triangle().draw();
				break;
			case 6:
				new Triangle().erase();
				break;
			default:
				new UnsupportedShapeException();
				break;
		}
	}
	public static void main(String[] args) {
		System.out.println("系统功能：1.绘制圆形 2.擦除圆形 3.绘制矩形 4.擦除矩形 5.绘制三角形 6.擦除三角形；退出系统请输入0。");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入功能所对应的序号(如：1)：");
			int i = sc.nextInt();
			if(i == 0){
				System.out.println("退出系统！！！");
				break;
			}
			new ShapeFactory(i);
		}
		sc.close();
	}
}
