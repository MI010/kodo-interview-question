package org.example;
import java.util.List;

public class NetPayCalculator {
    private List<TaxSlab> taxSlabs;
    public NetPayCalculator(List<TaxSlab> taxSlabList) {
        this.taxSlabs=taxSlabList;
    }

    public double inHandSalary(double salary){
        double totalTax =0;
        for(TaxSlab slab : taxSlabs){
            totalTax += slab.calculateTax(salary);
        }
        return salary-totalTax;
    }
}
