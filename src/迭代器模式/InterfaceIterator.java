package ������ģʽ;

public interface InterfaceIterator {
	void next();//������һ��Ԫ��
	boolean isLast();//�ж��Ƿ�Ϊ���һ��Ԫ��
	void previous();//������һ��Ԫ��
	boolean isFirst();//�ж��Ƿ�Ϊ��һ��Ԫ��
	String getNextItem();//��ȡ��һ��Ԫ��
	String getPreviousItem();//��ȡ��һ��Ԫ��
}
