package µü´úÆ÷Ä£Ê½;

import java.util.List;

public abstract class AbstractProductList {
	private List<String> productList;
	public AbstractProductList(List<String> pl){
		this.productList = pl;
	}
	
	public List<String> getProductList() {
		return productList;
	}

	public abstract InterfaceIterator createIterator();
}
