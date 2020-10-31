package com.interfaceexample;

public class ICICIBank implements RBI {
    @Override
    public void MinBalanceForSaving() {
        System.out.println("1000");
    }

    @Override
    public void MaxBalanceForSaving() {
        System.out.println("1000");
    }

    @Override
    public void ROIForSaving() {
        System.out.println("5%");
    }

    public void InternationalBanking(){
        System.out.println("This is a special feature in ICICI");
    }
}
