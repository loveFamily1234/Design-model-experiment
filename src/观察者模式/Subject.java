package �۲���ģʽ;

import java.util.ArrayList;

public abstract class Subject {
	protected ArrayList observers = new ArrayList();
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void Notify();
}
