package ������ģʽ;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>();
		products.add("ˮ��");
		products.add("����");
		products.add("�ֻ�");
		products.add("����");
		products.add("����");
		
		AbstractProductList list;
		InterfaceIterator iterator;
		
		list = new ProductList(products);//�����ۺ϶���
		iterator = list.createIterator();//��������������
		
		System.out.println("���������");
		while(!iterator.isLast()){
			System.out.print(iterator.getNextItem()+"��");
			iterator.next();
		}
		System.out.println("\n-----------------------------------------------------------------------");
		System.out.println("���������");
		while(!iterator.isFirst()){
			System.out.print(iterator.getPreviousItem()+"��");
			iterator.previous();
		}
	}
}
