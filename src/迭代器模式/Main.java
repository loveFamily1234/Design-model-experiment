package 迭代器模式;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> products = new ArrayList<String>();
		products.add("水杯");
		products.add("饭盒");
		products.add("手机");
		products.add("镜子");
		products.add("梳子");
		
		AbstractProductList list;
		InterfaceIterator iterator;
		
		list = new ProductList(products);//创建聚合对象
		iterator = list.createIterator();//创建迭代器对象
		
		System.out.println("正向遍历：");
		while(!iterator.isLast()){
			System.out.print(iterator.getNextItem()+"，");
			iterator.next();
		}
		System.out.println("\n-----------------------------------------------------------------------");
		System.out.println("逆向遍历：");
		while(!iterator.isFirst()){
			System.out.print(iterator.getPreviousItem()+"，");
			iterator.previous();
		}
	}
}
