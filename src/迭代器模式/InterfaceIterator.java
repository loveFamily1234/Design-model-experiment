package 迭代器模式;

public interface InterfaceIterator {
	void next();//移至下一个元素
	boolean isLast();//判断是否为最后一个元素
	void previous();//移至上一个元素
	boolean isFirst();//判断是否为第一个元素
	String getNextItem();//获取下一个元素
	String getPreviousItem();//获取上一个元素
}
