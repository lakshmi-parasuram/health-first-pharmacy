package com.hfp;

/**
 *
 * @author Lakshmi Parasuram <lakshmibhavani1712@gmail.com>
 */
public class Patient extends User {
    private Insurance insurance;
    private CreditCard creditCard;

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    
    public Patient(String username, String password, String mobile) {
        super(username, password, mobile);
    }
}
