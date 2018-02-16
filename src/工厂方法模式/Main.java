package 工厂方法模式;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("系统功能：1.读取GIF格式的图片 2.读取JPG格式的图片；退出系统请输入0。");
		Scanner sc = new Scanner(System.in);
		ImageReaderFactory irf;
		while(true){
			System.out.println("请输入功能所对应的序号(如：1)：");
			int i = sc.nextInt();
			if(i == 0){
				System.out.println("退出系统！！！");
				break;
			}
			if(i == 1){
				irf = new GifReaderFactory();
				irf.concrete();
			}
			if(i == 2){
				irf = new JpgReaderFactory();
				irf.concrete();
			}
		}
		sc.close();
	}
}
