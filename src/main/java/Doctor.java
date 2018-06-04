
public class Doctor extends Employee implements CaresForPatient, GetsBlood {
	
	private String specialty;

	public Doctor(String name, String employeeNumber, String specialty, int salary) {
		super(name, employeeNumber, salary);
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return specialty;
	}
	
	@Override
	public void careForPatient(Patient patient) {
		patient.heal(10);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.bleed(10);
	}

	@Override
	public String toString() {
		return "Doctor: " +getName() + " " + getEmployeeNumber() + " " + calculatePay();
	}

}
