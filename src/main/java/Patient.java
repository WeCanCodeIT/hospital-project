
public class Patient {
	private final int BLOOD_LEVEL = 20;
	private final int HEALTH_LEVEL = 10;
	
	private String name;
	private String patientNumber;
	private int bloodLevel = BLOOD_LEVEL;
	private int healthLevel = HEALTH_LEVEL;
	
	public Patient(String name, String patientNumber, int bloodLevel, int healthLevel) {
		this.name = name;
		this.patientNumber = patientNumber;
		this.bloodLevel = bloodLevel;
		this.healthLevel = healthLevel;
	}

	public Patient(String name, String patientNumber) {
		this.name = name;
		this.patientNumber = patientNumber;
	}

	public String getName() {
		return name;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void heal(int amountToHeal) {
		healthLevel += amountToHeal;
	}

	public void bleed(int amountOfBlood) {
		bloodLevel -= amountOfBlood;
	}
	
}
