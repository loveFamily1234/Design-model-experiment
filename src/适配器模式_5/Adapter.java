package   ≈‰∆˜ƒ£ Ω_5;

public class Adapter implements CatInterface,DogInterface{

	private CatInterface cat;
	private DogInterface dog;
	
	public Adapter(CatInterface cat){
		this.cat = cat;
	}
	
	public Adapter(DogInterface dog){
		this.dog = dog;
	}
	public void cry() {
		cat.catchMouse();
	}

	public void catchMouse() {
		dog.cry();
	}

}
