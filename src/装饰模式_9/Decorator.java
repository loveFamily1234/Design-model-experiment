package װ��ģʽ_9;

public class Decorator extends Transformer {

	private Transformer tf;
	public Decorator(Transformer tf){
		this.tf = tf;
	}
	public void operation() {
		tf.operation();
	}

}
