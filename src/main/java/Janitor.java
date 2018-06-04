
public class Janitor extends Employee {
	
	private boolean isSweeping;

	public Janitor(String name, String employeeNumber, boolean isSweeping, int salary) {
		super(name, employeeNumber, salary);
		this.isSweeping = isSweeping;
	}

	public boolean isSweeping() {
		return isSweeping;
	}

	public void toggleSweeping() {
		isSweeping = !isSweeping;
	}

	@Override
	public String toString() {
		return "Janitor: " + getName() + " " + getEmployeeNumber() + " " + calculatePay() + " " + isSweeping();
	}

}
