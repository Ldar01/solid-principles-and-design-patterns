package com.uca.DesignPatterns.structurals.adapter;

import com.uca.DesignPatterns.structurals.adapter.bad.OldCharger;
import com.uca.DesignPatterns.structurals.adapter.good.NewCharger;
import com.uca.DesignPatterns.structurals.adapter.good.OldChargerAdapter;
import com.uca.DesignPatterns.structurals.adapter.good.OldChargerGood;

public class Adapter {
    public static void main(String[] args) {
        badScene();
        goodScene();
    }

    public static void badScene(){
        System.out.println("=== Bad Scene ===");
        OldCharger oldCharger = new OldCharger();
        oldCharger.charge();
    }

    public static void goodScene(){
        System.out.println("=== Good Scene ===");
        OldChargerGood oldCharger = new OldChargerGood();
        NewCharger adapter = new OldChargerAdapter(oldCharger);
        adapter.chargeWithUSBTypeC();
    }
}
