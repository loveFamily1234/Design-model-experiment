package ������ģʽ;

import java.util.List;

public class ProductList extends AbstractProductList {

	public ProductList(List<String> pl) {
		super(pl);
	}

	public InterfaceIterator createIterator() {
		return new ProductIterator(this);
	}

}
