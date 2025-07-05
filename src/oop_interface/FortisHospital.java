package oop_interface;
// we have to read the below like FH extends MedicalClass and implements 3 interfaces
public class FortisHospital extends MedicalClass implements USMedical, UKMedical, IndianMedical, BrazilMedical {
	
	
	static final int MIN_FEE=100;
	
	//US
	@Override
	public void physioServices() {
		System.out.println(" USMedical -- FH -- Physioservices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println(" USMedical -- FH -- OncologyServices");
	}

	@Override
	public void dentalServices() {
		System.out.println(" USMedical -- FH -- DentalServices");
	}

	//UK
	@Override
	public void orthoServices() {
		System.out.println(" UKMedical -- FH -- OrthoServices");
	}

	@Override
	public void pediaServices() {
		System.out.println(" UKMedical -- FH -- PediaServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println(" UKMedical -- FH -- NeuroServices");
		
	}

	// India
	@Override
	public void entServices() {
		System.out.println(" IndianMedical -- FH -- EntServices");
		
	}

	@Override
	public void cardioServices() {
		 System.out.println(" IndianMedical -- FH -- CardioServices");
		
	}
	
	// Common methods 
	@Override
	public void emergencyServices() {
		System.out.println("FH - EmergencyServices - Common Methods");
		
	}
	
	//Individual methods:
	public void medialTraining() {
		System.out.println("FH -- Medical Training -- Individual Method");
	}
	
	public void optServices() {
		System.out.println("FH -- Opt Services -- Individual Method");
	}
	@Override
	public void medicalRnD() {
		System.out.println("FH --  RnD - Medical ");
	}

	// WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH - Covid Vaccination -- WHO ");
		
	}

	// Brazil
	@Override
	public void eyeCareServices() {
		System.out.println("FH - Eye CareServices - Brazil ");
	}

	@Override
	public void diabeticServices() {
		System.out.println("FH - Diabetics Services - Brazil");
	}

	// UN
	@Override
	public void newsLetter() {
		System.out.println("UN -- newsLetter Interface");
		
	}
	
	// Method hiding
	public static void printBilling() {
		System.out.println("FH -- PrintBilling ");
	}
	
	
	// default method can be overridden in the child class with public
	@Override
	public void medicalRecords() {
		System.out.println("FH -- Medical Records ");
	}
}
