package model;
import java.util.ArrayList;

public class Admin extends User {
	private ArrayList<Medicine> medicines;
	
    public Admin(String userId, String name, String email, String password) {
        super(userId, name, email, password);
        medicines = new ArrayList<>();
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
        System.out.println("Medicine added: " + medicine.getName());
    }

    public void removeMedicine(String medicineId) {
        medicines.removeIf(med -> med.getMedicineId().equals(medicineId));
        System.out.println("Medicine with ID " + medicineId + " removed.");
    }

    public void listMedicines() {
    	if (medicines.isEmpty()) {
            System.out.println("No medicines available.");
        } 
    	else {
        System.out.println("Available Medicines:");
        for (Medicine med : medicines) {
            System.out.println(med);
        }
    	}
    }
    
    public Medicine searchMedicine(String name) {
        for (Medicine med : medicines) {
            if (med.getName().equalsIgnoreCase(name)) {
                return med;
            }
        }
        return null;
    }

    
    
}
