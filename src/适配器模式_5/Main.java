package 适配器模式_5;

public class Main {

	public static void main(String[] args) {
		CatInterface cat = new Cat();
		DogInterface dog = new Dog();
		System.out.println("猫的技能包：");
		Adapter adapter = new Adapter(dog);
		cat.catchMouse();
		adapter.catchMouse();
		System.out.println("------------------------------------------------------------");
		System.out.println("狗的技能包：");
		adapter = new Adapter(cat);
		dog.cry();
		adapter.cry();
	}
}
