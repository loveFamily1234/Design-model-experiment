package ���ģʽ_8;

import java.util.ArrayList;

public class Plate extends AbstractFruit{
	private String name;
	private ArrayList<AbstractFruit> list = new ArrayList<>();
	public Plate(String name){
		this.name = name;
	}
	public void add(AbstractFruit af){
		list.add(af);
	}
	public void remove(AbstractFruit af){
		list.remove(af);
	}
	public void eat(){
		System.out.println("����һ����Ϊ"+name +"�����ӣ����ųԣ�����");
		for(int i = 0; i<list.size(); i++){
			AbstractFruit af = (AbstractFruit)list.get(i);
			af.eat();
		}
	}
}
