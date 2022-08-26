package com.hfp;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi Parasuram <lakshmibhavani1712@gmail.com>
 */
public class Prescription {
    public enum Status {
        MEDS_NOT_AVAIL,
        NOTIFIED_MANAGER,
        PAYMENT_PENDING,
        PAID,
        DISPENSED
    }
    private String ID;
    
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    private ArrayList<Medicine> medicines;

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }
    
    private String paymentMethod;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    
    /**
     * "Meds Not Available"
     * "Payment Pending"
     * "Paid"
     * "Dispensed"
     */
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public String getStatusString(Status status) {
        String statusText = "";
        switch (status) {
            case MEDS_NOT_AVAIL:
                statusText = "Meds Not Available";
                break;
            case NOTIFIED_MANAGER:
                statusText = "Notified Manager";
                break;
            case PAYMENT_PENDING:
                statusText = "Payment Pending";
                break;
                         
            case PAID:
                statusText = "Paid";
                break;
             case   DISPENSED: default:
                 statusText = "Dispensed";
                break;
        }
        return statusText;
    }
    
    public Status getNextStatus(Status status) {
        Status returnStatus;
        switch (status) {
            case MEDS_NOT_AVAIL:
                returnStatus = Status.NOTIFIED_MANAGER;
                break;
            case NOTIFIED_MANAGER:
                returnStatus = Status.PAYMENT_PENDING;
                break;
            case PAYMENT_PENDING:
                returnStatus = Status.PAID;
                break;
                         
            case PAID: default:
                returnStatus = Status.DISPENSED;
                break;
        }
        return returnStatus;
    }
    
    
}
