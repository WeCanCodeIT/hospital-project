import java.util.HashMap;

public class HospitalApp {
	public static void main(String[] args) {
		Hospital highStreetHospital = new Hospital("High Street Hospital", new HashMap<Long, Employee>(), new HashMap<Long, Patient>(), true);
		
		System.out.println("Welcome to High Street Hospital!");
		System.out.println("Here is our current staff:");
		highStreetHospital.addEmployee(new Surgeon("Edward", "99401", "Brain", 120000, false));
		highStreetHospital.addEmployee(new Doctor("Phil", "12354", "Brain", 90000));
		highStreetHospital.addEmployee(new Nurse("Jackie", "93945", 4, 50000));
		highStreetHospital.addEmployee(new Receptionist("Jon", "23496", false, 40000));
		highStreetHospital.addEmployee(new Janitor("Karl", "82393", false, 45000));
		highStreetHospital.addEmployee(new VampireJanitor("Coach Feratu", "666", false, 900000, 20));
		
		for (Employee current : highStreetHospital.getEmployees()) {
			System.out.println(current);
		}
	}
}
