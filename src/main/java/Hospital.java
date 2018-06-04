import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {
	
	private String name;
	private Map<Long, Employee> employees;
	private Map<Long, Patient> patients;
	private boolean isOpen;

	public Hospital(String name, HashMap<Long, Employee> employees, HashMap<Long, Patient> patients, boolean isOpen) {
		this.name = name;
		this.employees = employees;
		this.patients = patients;
		this.isOpen = isOpen;
	}

	public String getName() {
		return name;
	}

	public Collection<Employee> getEmployees() {
		return employees.values();
	}

	public Collection<Patient> getPatients() {
		return patients.values();
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void addEmployee(Employee employee) {
		employees.put(Long.parseLong(employee.getEmployeeNumber()), employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(Long.parseLong(employee.getEmployeeNumber()));
	}

	public void addPatient(Patient patient) {
		patients.put(Long.parseLong(patient.getPatientNumber()), patient);
	}

	public void removePatient(Patient patient) {
		patients.remove(Long.parseLong(patient.getPatientNumber()));
	}
	
}
