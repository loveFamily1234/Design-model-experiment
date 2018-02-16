package µü´úÆ÷Ä£Ê½;

import java.util.List;

public class ProductList extends AbstractProductList {

	public ProductList(List<String> pl) {
		super(pl);
	}

	public InterfaceIterator createIterator() {
		return new ProductIterator(this);
	}

}
