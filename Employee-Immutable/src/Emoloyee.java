
public abstract class Emoloyee {
	private final String name;
	private final String empId;
	
	/*
	 * package level access for constructor so that 
	 * we can call from same package only 
	 * and outside package can not access 
	 * and no more outside subclass
	 * which can change the immutable behavior
	 */
	Emoloyee(String name, String empId) {
		this.empId = empId;
		this.name = name;
	}

	public final String getName() {
		return name;
	}
	
	public final String getEmpId() {
		return empId;
	}
	
	
}
