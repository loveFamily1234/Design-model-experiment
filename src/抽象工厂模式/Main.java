package ���󹤳�ģʽ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("ϵͳ���ܣ�1.�����������ӻ� 2.���������յ� 3.����TCL���ӻ� 4.����TCL�յ����˳�ϵͳ������0��");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("�����빦������Ӧ�����(�磺1)��");
			int i = sc.nextInt();
			if(i == 0){
				System.out.println("�˳�ϵͳ������");
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
