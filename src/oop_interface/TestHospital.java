package oop_interface;

public class TestHospital {

	public static void main(String[] args) {
		
		System.out.println("---------- Fortis Hospital - Services ----------");
		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.oncologyServices();
		fh.dentalServices();
		fh.cardioServices();
		fh.entServices();
		fh.neuroServices();
		fh.medialTraining();
		fh.optServices();
		fh.emergencyServices();
		
		fh.medicalRnD(); // Overridden
		
		MedicalClass.medicalNews();
		FortisHospital.medicalNews();
		fh.covidVaccination();
		System.out.println("Min Fee: "+USMedical.MIN_FEE);  // 10
		
		System.out.println("Min Fee: "+FortisHospital.MIN_FEE); // 100
		
//		USMedical.MIN_FEE=1000;  // Final field cannot be changed so final for interface vars is proved -- The final field USMedical.MIN_FEE cannot be assigned
		
		
		USMedical.printBilling(); // Static method will be called using interface name
		
		
		FortisHospital.printBilling(); // Method hidding is called from child class 
			// static method in the interface cannot be accessed by the child class name.
			// Static method cannot be override - if we give same static method in child class is called method hiding 
		
		//fh.medicalRecords(); 
		// DEFAULT method from parent interface will be called first  
		
		fh.medicalRecords(); // Method from child class FortisHospital will be called .. 
		// after overridden the method with public the overridden method will be called @Line NO 42: 
		
		//		fh.medicalRecords(100);// Overloaded the overrided method 
		
		System.out.println("\n");
		System.out.println("---------- Rainbow Hospital - Services ----------");
		RainbowHospital rh = new RainbowHospital();
		rh.medialTraining();
		rh.medicalRnD();
		RainbowHospital.medicalNews();
		
		System.out.println("\n");
		
		// top casting - child class object is referred by parent interface reference variable 
		
		System.out.println("---------- Fortis Hospital - Services ----------");
		
		USMedical us = new FortisHospital();
		
		us.physioServices();
		us.oncologyServices();
		us.dentalServices();
		us.emergencyServices();
		us.covidVaccination();
		
		us.medicalRecords();
		
		System.out.println("\n");
		
		// interface to interface method access
		// using interface to interface casting
		// us ---> uk
		
		System.out.println("------Interface to Interface casting--------");
		UKMedical uk1 =(UKMedical)us; // with interface casting we are avoid creation of unnecessary Object
		
		uk1.orthoServices();
		uk1.pediaServices();
		uk1.neuroServices();
		System.out.println("\n");
		
		us.oncologyServices();
		us.dentalServices();
		System.out.println("\n");
		
		IndianMedical inm = (IndianMedical) us;
		inm.cardioServices();
		inm.entServices();
		
		System.out.println("------------------------------");
//		UKMedical uk = new FortisHospital();
//		uk.orthoServices();
//		uk.pediaServices();
//		uk.neuroServices();
//		uk.emergencyServices();
//		uk.covidVaccination();
//		System.out.println("\n");
//		// down casting : NA  - Uding the Compile it self we will get the casting error.
//		
//		IndianMedical im = new FortisHospital();
//		im.cardioServices();
//		im.entServices();
//		im.emergencyServices();
//		im.covidVaccination();
//		
//		System.out.println("\n");
//		
		MedicalClass mc = (MedicalClass)us;
		mc.emergencyServices();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
