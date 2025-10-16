package com.uca.SOLID.interfaceSegregationPrinciple;

import com.uca.SOLID.interfaceSegregationPrinciple.bad.BasicPrinter;
import com.uca.SOLID.interfaceSegregationPrinciple.good.OfficePrinter;
import com.uca.SOLID.interfaceSegregationPrinciple.good.SimplePrinter;

public class InterfaceSegregation {
    public static void main(String[] args) {
        badScene();
        goodScene();
    }

    public static void badScene(){
        System.out.println("=== Bad Scene: ===");
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();
        basicPrinter.scan();
        basicPrinter.fax();
    }

    public static void goodScene(){
        System.out.println("=== Good Scene: ===");
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();

        OfficePrinter officePrinter = new OfficePrinter();
        officePrinter.print();
        officePrinter.scan();
    }
}
