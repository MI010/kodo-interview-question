package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetPayCalculatorTest {



    @Test
    void netPayCalculatorTest1(){
        TaxSlab s1 = new TaxSlab(0,500000,5);
        TaxSlab s2 = new TaxSlab(500000,1000000,10);
        TaxSlab s3 = new TaxSlab(1000000,Double.MAX_VALUE,20);


        NetPayCalculator calculator = new NetPayCalculator(Arrays.asList(s1,s2,s3));
        double inHandSal = calculator.inHandSalary(600000);
        assertEquals(565000,inHandSal);
    }
}
