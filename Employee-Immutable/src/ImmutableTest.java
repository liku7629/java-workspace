
public class ImmutableTest {

	public static void main(String[] args) {
		Emoloyee emoloyee = new Accountant("Liku", "1213", "bank");
		System.out.println(emoloyee);
		
		Emoloyee empEmoloyee = ((Accountant)emoloyee).setAccount("Priyabrat");
		System.out.println(empEmoloyee);
		
		System.out.println(System.identityHashCode(emoloyee));
		System.out.println(System.identityHashCode(empEmoloyee));
	}
	

}
