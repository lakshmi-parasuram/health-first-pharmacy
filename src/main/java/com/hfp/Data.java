package com.hfp;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi Parasuram <lakshmibhavani1712@gmail.com>
 */
public class Data {
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        
        ArrayList<Patient> patients = this.getPatients();
        for (Patient patient : patients) {
            users.add(patient);
        }
        
        ArrayList<Pharmacist> pharmacists = this.getPharmacists();
        for (Pharmacist pharmacist: pharmacists){
            users.add(pharmacist);
        }
        
        ArrayList<Manager> managers = this.getManagers();
        for (Manager manager: managers){
            users.add(manager);
        }
        
        ArrayList<Admin> admins = this.getAdmins();
        for (Admin admin: admins){
            users.add(admin);
        }
        
        return users;
    }
    
    public ArrayList<Patient> getPatients() {
        ArrayList<Patient> patients = new ArrayList<>();
        
        Patient patient1 = new Patient("patient1", "1234");
        patients.add(patient1);
        Patient patient2 = new Patient("patient2", "1234");
        patients.add(patient2);
        return patients;
    }
    
    public ArrayList<Prescription> getPrescriptions() {
        ArrayList<Prescription> prescriptions = new ArrayList<>();
        
        // Prescription 1
        Prescription prescription = new Prescription();
        prescription.setID("pr123");
        
        ArrayList<Doctor> doctors = this.getDoctors();
        prescription.setDoctor(doctors.get(0));
        
        ArrayList<Patient> patients = this.getPatients();
        prescription.setPatient(patients.get(0));
        double totalPrice = 0;
        ArrayList<Medicine> allMedicines = this.getMedicines();
        ArrayList<Medicine> presMeds = new ArrayList<>();
        for (int i=0; i< allMedicines.size() - 1; i++) {
            Medicine med = allMedicines.get(i);
            totalPrice += med.getPrice();
            presMeds.add(med);
        }
        prescription.setMedicines(presMeds);
        
        prescription.setTotalPrice(totalPrice);
        
        prescriptions.add(prescription);
        // second prescription
        Prescription presc2 = new Prescription();
        presc2.setID("pr135");
        
        presc2.setDoctor(doctors.get(1));
        
        presc2.setPatient(patients.get(1));
        
        ArrayList<Medicine> presMeds2 = new ArrayList<>();
        totalPrice = 0;
        
        for (int i=1; i< allMedicines.size(); i++) {
            Medicine med = allMedicines.get(i);
            totalPrice += med.getPrice();
            presMeds2.add(med);
        }
        presc2.setMedicines(presMeds2);
        
        presc2.setTotalPrice(totalPrice);
        
        prescriptions.add(presc2);
        return prescriptions;
    }
    
    public ArrayList<Medicine> getMedicines() {
        ArrayList<Medicine> medicines = new ArrayList<>();
        
        Medicine medicine = new Medicine();
        medicine.setID("m12");
        medicine.setName("Paracetamol");
        medicine.setPrice(1.2);
        medicines.add(medicine);
        
        Medicine medicine2 = new Medicine();
        medicine2.setID("m13");
        medicine2.setName("Aspirin");
        medicine2.setPrice(0.9);
        medicines.add(medicine2);
        
        Medicine medicine3 = new Medicine();
        medicine3.setID("m14");
        medicine3.setName("Benadryl");
        medicine3.setPrice(1.1);
        
        medicines.add(medicine3);
        
        return medicines;
    }
    
    public ArrayList<Doctor> getDoctors() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        
        Doctor doctor = new Doctor();
        doctor.setName("Doctor1");
        
        Doctor doctor2 = new Doctor();
        doctor2.setName("Doctor2");
        
        doctors.add(doctor);
        doctors.add(doctor2);
        return doctors;
    }
    
    public ArrayList<Pharmacist> getPharmacists() {
        ArrayList<Pharmacist> pharmacists = new ArrayList<>();
        
        Pharmacist phr1 = new Pharmacist("pharmacist1", "1234");
        pharmacists.add(phr1);
        Pharmacist phr2 = new Pharmacist("pharmacist2", "1234");
        pharmacists.add(phr2);
        return pharmacists;
    }
    
    
    public ArrayList<Manager> getManagers() {
        ArrayList<Manager> managers = new ArrayList<>();
        
        Manager manager = new Manager("manager1", "1234");
        managers.add(manager);
        
        return managers;
    }
    
    public ArrayList<Admin> getAdmins() {
        ArrayList<Admin> admins = new ArrayList<>();
        
        Admin admin = new Admin("admin1", "1234");
        admins.add(admin);
        
        return admins;
    }
    
    
    public Inventory getInventory() {
        ArrayList<Medicine> medicines = this.getMedicines();
        Inventory inventory = new Inventory();
        ArrayList<MedicineWithQuantity> medicinesWithQuantity = new ArrayList<>();
        for(int i =0;i< medicines.size(); i++) {
            Medicine med = medicines.get(i);
            MedicineWithQuantity medWithQ = new MedicineWithQuantity();
            medWithQ.setMedicine(med);
            medWithQ.setQuantity(i+1);
            medicinesWithQuantity.add(medWithQ);
        }
        inventory.setMedicinesWithQuantity(medicinesWithQuantity);
        return inventory;
    }

}
