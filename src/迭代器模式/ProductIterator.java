package 迭代器模式;

import java.util.List;

public class ProductIterator implements InterfaceIterator {
	
	private ProductList productList;
	private List<String> products;
	private int cursor1;//定义一个游标，用于记录正向遍历的位置
	private int cursor2;//定义一个游标，用于记录逆向遍历的位置
	
	public ProductIterator(ProductList list){
		this.productList = list;
		this.products = productList.getProductList();
		this.cursor1 = 0;
		this.cursor2 = products.size() - 1;
	}
	
	public void next() {
		if(cursor1 < products.size()){
			cursor1++;
		}
	}

	public boolean isLast() {
		if(cursor1 == products.size()){
			return true;
		}
		return false;
	}


	public void previous() {
		if(cursor2 > -1){
			cursor2--;
		}
	}


	public boolean isFirst() {
		if(cursor2 == -1){
			return true;
		}
		return false;
	}


	public String getNextItem() {
		return products.get(cursor1);
	}


	public String getPreviousItem() {
		return products.get(cursor2);
	}

}
