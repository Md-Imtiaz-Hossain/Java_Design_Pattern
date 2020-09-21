package com.company.CalculateTax;

public class Calculate2019 implements CalculateTax {

    public void calInterest(){
        System.out.println("Interest");
    }

    @Override
    public int calculate() {
        return 2019;
    }


}
