/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        
        Prescription prescription = new Prescription();
        prescription.setID("123");
        
        ArrayList<Doctor> doctors = this.getDoctors();
        prescription.setDoctor(doctors.get(0));
        
        ArrayList<Patient> patients = this.getPatients();
        prescription.setPatient(patients.get(0));
        
        ArrayList<Medicine> medicines = this.getMedicines();
        prescription.setMedicines(medicines);
        
        
        prescriptions.add(prescription);
        
        
        return prescriptions;
    }
    
    public ArrayList<Medicine> getMedicines() {
        ArrayList<Medicine> medicines = new ArrayList<>();
        
        Medicine medicine = new Medicine();
        medicine.setName("Paracetamol");
        medicine.setPrice(1.2);
        
        medicines.add(medicine);
        
        return medicines;
    }
    
    public ArrayList<Doctor> getDoctors() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        
        Doctor doctor = new Doctor();
        doctor.setName("Doctor1");
        
        doctors.add(doctor);
        return doctors;
    }
}
