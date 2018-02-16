package 组合模式_8;

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
		System.out.println("这是一个名为"+name +"的盘子，接着吃！！！");
		for(int i = 0; i<list.size(); i++){
			AbstractFruit af = (AbstractFruit)list.get(i);
			af.eat();
		}
	}
}
