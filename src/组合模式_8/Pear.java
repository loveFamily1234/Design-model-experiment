package 组合模式_8;

public class Pear extends AbstractFruit{
	private String name;
	public Pear(String name){
		this.name = name;
	}
	public void eat(){
		System.out.println("我吃了"+name+"！！！");
	}
}
