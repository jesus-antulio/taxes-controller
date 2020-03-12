package oop.inheritance;

public class Resident extends ITaxable implements IResident{

    @Override
    public float getTaxDiscountRate() {
        return 0;
    }

    public float getIncomeTaxRate(){
        return 0;
    }
}
