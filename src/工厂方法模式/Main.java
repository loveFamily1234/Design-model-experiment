package ��������ģʽ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("ϵͳ���ܣ�1.��ȡGIF��ʽ��ͼƬ 2.��ȡJPG��ʽ��ͼƬ���˳�ϵͳ������0��");
		Scanner sc = new Scanner(System.in);
		ImageReaderFactory irf;
		while(true){
			System.out.println("�����빦������Ӧ�����(�磺1)��");
			int i = sc.nextInt();
			if(i == 0){
				System.out.println("�˳�ϵͳ������");
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
