package 工厂方法模式;

public class GifReaderFactory implements ImageReaderFactory {

	@Override
	public void concrete() {
		// TODO Auto-generated method stub
		new GifReader().read();
	}

}
