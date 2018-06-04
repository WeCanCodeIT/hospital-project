import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.HashMap;

import org.junit.Test;

public class HospitalTest {
	Hospital highStreetHospital = new Hospital("High Street Hospital", new HashMap<Long, Employee>(), new HashMap<Long, Patient>(), true);
	
	@Test
	public void addEmployeeShouldAddAnEmployeeToTheMap() {
		Doctor oz = new Doctor("Oz", "7777", "Bullshit", 90000);
		
		highStreetHospital.addEmployee(oz);
		
		System.out.println(oz);
		
		assertThat(highStreetHospital.getEmployees(), hasItem(oz));
	}
	
	@Test
	public void removeEmployeeShouldRemoveAnEmployeeToTheMap() {
		Doctor oz = new Doctor("Oz", "7777", "Bullshit", 90000);
		
		highStreetHospital.addEmployee(oz);
		highStreetHospital.removeEmployee(oz);
		
		assertThat(highStreetHospital.getEmployees(), not(hasItem(oz)));
	}
	
	@Test
	public void addPatientShouldAddAPatientToTheMap() {
		Patient rick = new Patient("Rick", "1111", 25, 25);
		
		highStreetHospital.addPatient(rick);
		
		assertThat(highStreetHospital.getPatients(), hasItem(rick));
	}
	
	@Test
	public void removePatientShouldRemoveAPatientToTheMap() {
		Patient morty = new Patient("Morty", "2222", 5000, 10000);
		
		highStreetHospital.addPatient(morty);
		highStreetHospital.removePatient(morty);
		
		assertThat(highStreetHospital.getPatients(), not(hasItem(morty)));
	}
}
