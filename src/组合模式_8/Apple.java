package 组合模式_8;

public class Apple extends AbstractFruit{
	private String name;
	
	public Apple(String name) {
		this.name = name;
	}

	public void eat(){
		System.out.println("我吃了"+name+"！！！");
	}
}
