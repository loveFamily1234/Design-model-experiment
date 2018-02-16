package 单例模式和原型模式_6;

public class ClientMain {
	public static void main(String[] args) {
		
		GongWenManager manager =  GongWenManager.getManager();
		manager.get("A");
		manager.get("B");
	}
}
