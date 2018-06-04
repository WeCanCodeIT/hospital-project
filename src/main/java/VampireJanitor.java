
public class VampireJanitor extends Janitor implements GetsBlood {
	
	private int bloodThirst;

	public VampireJanitor(String name, String employeeNumber, boolean isSweeping, int salary, int bloodThirst) {
		super(name, employeeNumber, isSweeping, salary);
		this.bloodThirst = bloodThirst;
	}

	@Override
	public void drawBlood(Patient patient) {
	}

	public int getBloodThirst() {
		return bloodThirst;
	}

	public void feed(Patient patient, int amountToFeed) {
		patient.bleed(amountToFeed);
		bloodThirst -= amountToFeed;
	}

	@Override
	public String toString() {

		return "Vampire Janitor: " + getName() + " " + getEmployeeNumber() + " " + calculatePay() + " " + getBloodThirst();
	}

}
