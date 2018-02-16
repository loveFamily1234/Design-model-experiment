package �򵥹���ģʽ;

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
		System.out.println("ϵͳ���ܣ�1.����Բ�� 2.����Բ�� 3.���ƾ��� 4.�������� 5.���������� 6.���������Σ��˳�ϵͳ������0��");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("�����빦������Ӧ�����(�磺1)��");
			int i = sc.nextInt();
			if(i == 0){
				System.out.println("�˳�ϵͳ������");
				break;
			}
			new ShapeFactory(i);
		}
		sc.close();
	}
}
