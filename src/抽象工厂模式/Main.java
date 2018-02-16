package 抽象工厂模式;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("系统功能：1.生产海尔电视机 2.生产海尔空调 3.生产TCL电视机 4.生产TCL空调；退出系统请输入0。");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入功能所对应的序号(如：1)：");
			int i = sc.nextInt();
			if(i == 0){
				System.out.println("退出系统！！！");
				break;
			}
			switch(i){
				case 1:
					new HaierFactory().concrete(1);
					break;
				case 2:
					new HaierFactory().concrete(2);
					break;
				case 3:
					new TCLFactory().concrete(1);
					break;
				case 4:
					new TCLFactory().concrete(2);
					break;
			}
		}
		sc.close();
	}
}
