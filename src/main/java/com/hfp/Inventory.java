package com.hfp;

import java.util.ArrayList;

/**
 *
 * @author Lakshmi Parasuram <lakshmibhavani1712@gmail.com>
 */
public class Inventory {
    private ArrayList<MedicineWithQuantity> medicinesWithQuantity;

    public ArrayList<MedicineWithQuantity> getMedicinesWithQuantity() {
        return medicinesWithQuantity;
    }

    public void setMedicinesWithQuantity(ArrayList<MedicineWithQuantity> medicinesWithQuantity) {
        this.medicinesWithQuantity = medicinesWithQuantity;
    }
}
