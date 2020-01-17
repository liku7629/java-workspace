
public final class ItWorker extends Emoloyee {

	private final String iTwork; 
	
	ItWorker(String name, String empId, String iTWork) {
		super(name, empId);
		this.iTwork = iTWork;
	}
	
	public final String getiTwork() {
		return iTwork;
	}

	
	//if state of the object changes
	//then create a new object and return it 
	//with the changed value
	public ItWorker setiTwork(String iTwork) {
		return new ItWorker(super.getName(), super.getEmpId(), iTwork);
	}
	
	
	@Override
	public String toString() {
		return "iTwork iTwork: " + iTwork + 
				"Name: " + super.getName() + 
				"EMpId: " + super.getEmpId() + 
				"Refrence: " + this;
	}
	

}
