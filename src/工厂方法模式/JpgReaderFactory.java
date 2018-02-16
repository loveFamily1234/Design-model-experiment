package 工厂方法模式;

public class JpgReaderFactory implements ImageReaderFactory {

	@Override
	public void concrete() {
		// TODO Auto-generated method stub
		new JpgReader().read();
	}

}
