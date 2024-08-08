package org.example;

public class TaxSlab {
    private double lowerLimit;


    private double upperLimit;
    private double rate;
    public TaxSlab(double lowerLimit, double upperLimit, double rate) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.rate = rate;
    }

    public double getLowerLimit() {
        return lowerLimit;
    }



    public double getUpperLimit() {
        return upperLimit;
    }



    public double getRate() {
        return rate;
    }

    public double calculateTax(double salary){
        double taxableIncome = Math.min(upperLimit-lowerLimit,salary-lowerLimit);
        return taxableIncome>0?(taxableIncome*rate)/100:0;
    }


}
