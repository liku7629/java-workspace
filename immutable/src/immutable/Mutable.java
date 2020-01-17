package immutable;

public class Mutable extends Immutable{
	private int realValue;
	
	
	public Mutable(int value) {
		super(value);
		
		this.realValue = value;
	}

	public void setValue(int value) {
		this.realValue = value;
	}
	
	
	//getter of super class is overridden 
	//so that when super class getter is called
	//we can return subclass variable value
	//otherwise super class variable will be returned
	//and make it immutable
	
	
	@Override
	public int getValue() {
		return realValue;
	}
	
	public static void main(String[] args) {
		Immutable immutable = new Mutable(10);
		System.out.println(immutable.getValue());
		Mutable mutable = (Mutable)immutable;
		mutable.setValue(25);
		System.out.println(immutable.getValue());
	}
}
