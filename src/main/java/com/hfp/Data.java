package com.hfp;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lakshmi Parasuram <lakshmibhavani1712@gmail.com>
 */
public class Data {
    /**
     * Get all Patients, Pharmacists, Managers and Admins
     * and Return as Users
     * 
     * @return ArrayList<User>
     */
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
    
    /**
     * Create bootstrapped Patients for the system and return them
     * @return 
     */
    public ArrayList<Patient> getPatients() {
        ArrayList<Patient> patients = new ArrayList<>();
        
        Patient patient1 = new Patient("patient1", "1234", "07543678909");
        Insurance ins = new Insurance();
        ins.setInsuranceNumber("NHS123");
        ins.setProvider("NHS");
        patient1.setInsurance(ins);
        patients.add(patient1);
        Patient patient2 = new Patient("patient2", "1234", "076543536332");
        CreditCard cc = new CreditCard();
        cc.setCardNo("1234 5678 9012");
        cc.setCvv("xxx");
        cc.setExpiryMonth("12");
        cc.setExpiryYear("2024");
        cc.setNameOnCard("Patient 2");
        patient2.setCreditCard(cc);
        patients.add(patient2);
        return patients;
    }
    
    /**
     * Create bootstrapped Prescriptions by retrieving
     * - Doctors
     * - Patients
     * - All Medicines 
     * Setup a price, quantity and return Prescriptions
     * 
     * @return ArrayList<Prescription>
     */
    public ArrayList<Prescription> getPrescriptions() {
        ArrayList<Prescription> prescriptions = new ArrayList<>();
        
        // Prescription 1
        Prescription prescription = new Prescription();
        prescription.setID("pr123");
        
        ArrayList<Doctor> doctors = this.getDoctors();
        prescription.setDoctor(doctors.get(0));
        
        ArrayList<Patient> patients = this.getPatients();
        prescription.setPatient(patients.get(0));
        // 
        prescription.setStatus(Prescription.Status.MEDS_NOT_AVAIL);
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
        
        // other prescription
        Prescription pr1 = new Prescription();
        pr1.setID("pr223");
        
        pr1.setDoctor(doctors.get(0));
        pr1.setPatient(patients.get(0));
        pr1.setStatus(Prescription.Status.PAID);
        totalPrice = 0;
        ArrayList<Medicine> presMeds3 = new ArrayList<>();
        for (int i=0; i< allMedicines.size() - 1; i++) {
            Medicine med = allMedicines.get(i);
            totalPrice += med.getPrice();
            presMeds3.add(med);
        }
        pr1.setMedicines(presMeds3);
        
        pr1.setTotalPrice(totalPrice);
        
        prescriptions.add(pr1);
        // second prescription
        Prescription presc2 = new Prescription();
        presc2.setID("pr135");
        
        presc2.setDoctor(doctors.get(1));
        
        presc2.setPatient(patients.get(1));
        
        presc2.setStatus(Prescription.Status.PAYMENT_PENDING);
        
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
    
    /**
     * Create bootstrapped Medicines for the system usage
     * @return ArrayList<Medicine>
     */
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
    
    /**
     * Create bootstrapped Doctors for the system usage
     * 
     * @return ArrayList<Doctor>
     */
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
    
    /**
     * Create bootstrapped Pharmacists for the system usage
     * 
     * @return ArrayList<Pharmacist>
     */
    public ArrayList<Pharmacist> getPharmacists() {
        ArrayList<Pharmacist> pharmacists = new ArrayList<>();
        
        Pharmacist phr1 = new Pharmacist("pharmacist1", "1234", "071234567");
        pharmacists.add(phr1);
        Pharmacist phr2 = new Pharmacist("pharmacist2", "1234", "0798765432");
        pharmacists.add(phr2);
        return pharmacists;
    }
    
    /**
     * Create bootstrapped Managers for the system usage
     * 
     * @return ArrayList<Manager>
     */
    public ArrayList<Manager> getManagers() {
        ArrayList<Manager> managers = new ArrayList<>();
        
        Manager manager = new Manager("manager1", "1234", "07896545676");
        managers.add(manager);
        
        return managers;
    }
    
    /**
     * Create bootstrapped Admins for the the system usage
     * @return ArrayList<Admin>
     */
    public ArrayList<Admin> getAdmins() {
        ArrayList<Admin> admins = new ArrayList<>();
        
        Admin admin = new Admin("admin1", "1234", "067678878787");
        admins.add(admin);
        
        return admins;
    }
    
    
    /**
     * Create bootstrapped Inventory by getting all Medicines
     * Set Medicine With Quantity and return the Inventory object
     * @return Inventory
     */
    public Inventory getInventory() {
        ArrayList<Medicine> medicines = this.getMedicines();
        Inventory inventory = new Inventory();
        ArrayList<MedicineWithQuantity> medicinesWithQuantity = new ArrayList<>();
        for(int i =0;i< medicines.size(); i++) {
            Medicine med = medicines.get(i);
            MedicineWithQuantity medWithQ = new MedicineWithQuantity();
            medWithQ.setMedicine(med);
            
            if (i == 0) {
                medWithQ.setQuantity(i);
            } else {
                Random random = new Random();
                medWithQ.setQuantity(random.nextInt(11));
            }
            medicinesWithQuantity.add(medWithQ);
        }
        inventory.setMedicinesWithQuantity(medicinesWithQuantity);
        return inventory;
    }

}
