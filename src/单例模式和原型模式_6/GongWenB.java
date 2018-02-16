package 单例模式和原型模式_6;

public class GongWenB extends AbstractGongWen{

	public GongWenB(){
//		System.out.println("这是B类公文模板！！！");
	}
	public AbstractGongWen clone() {
		GongWenB gongWenB = new GongWenB();
		System.out.println("通过克隆方法克隆出了一个B类公文！！！");
		return gongWenB;
	}
}
