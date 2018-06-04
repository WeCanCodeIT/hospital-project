
public class Nurse extends Employee implements CaresForPatient {
	
	private int numberOfPatients;

	public Nurse(String name, String employeeNumber, int numberOfPatients, int salary) {
		super(name, employeeNumber, salary);
		this.numberOfPatients = numberOfPatients;
	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.heal(5);
	}

}
