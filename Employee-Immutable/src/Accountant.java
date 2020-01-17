
//This class is final so that 
//it can't be subclass and no more
//loss of immutability
public final class Accountant extends Emoloyee {

	private final  String account;
	
	Accountant(String name, String empId, String account) {
		super(name, empId);
		this.account = account;
	}
	
	public String getAccount() {
		return account;
	}
	
	public Accountant setAccount(String account) {
		return new Accountant(super.getName(), super.getEmpId(), account);
	}

	@Override
	public String toString() {
		return "Accountant account: " + account + 
				"Name: " + super.getName() + 
				"EMpId: " + super.getEmpId(); 
	}
	
	

}
