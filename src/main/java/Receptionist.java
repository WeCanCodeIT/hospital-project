
public class Receptionist extends Employee {
	
	private boolean isOnPhone;

	public Receptionist(String name, String employeeNumber, boolean isOnPhone, int salary) {
		super(name, employeeNumber, salary);
		this.isOnPhone = isOnPhone;
	}

	public boolean isOnPhone() {
		return isOnPhone;
	}

	public void toggleOnPhone() {
		isOnPhone = !isOnPhone;
	}

	@Override
	public String toString() {
		return "Receptionist: " + getName() + " " + getEmployeeNumber() + " " + calculatePay() + " " + isOnPhone();
	}
	
}
