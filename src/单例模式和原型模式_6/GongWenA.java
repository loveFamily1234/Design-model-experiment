package 单例模式和原型模式_6;

public class GongWenA extends AbstractGongWen{

	public GongWenA(){
//		System.out.println("这是A类公文模板！！！");
	}
	public AbstractGongWen clone() {
		GongWenA gongWenA = new GongWenA();
		System.out.println("通过克隆方法克隆出了一个A类公文！！！");
		return gongWenA;
	}

}
