package oop.inheritance;

import java.util.List;

public class TaxesController implements IResident {
    public int estimateTaxIncome (List<IResident> residetns){
        return 0;
    }
    @Override
    public float getTaxDiscountRate() {
        return 0;
    }
}
