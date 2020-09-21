package com.company.CalculateTax;

import com.company.CalculateTax.CalculateTax;

public class Main {

    public static void main(String[] args) {

        CalculateTax calculateTax = calculateTax();
        System.out.println(calculateTax.calculate());




    }

    public static CalculateTax calculateTax(){
        return new Calculate2020();
    }
}
