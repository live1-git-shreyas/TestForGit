package com.interfaceexample;

public class TestBank {
    public static void main(String[] args) {
        RBI ic = new ICICIBank();
        ic.MinBalanceForSaving();
        ic.MaxBalanceForSaving();
        ic.ROIForSaving();
      //  ic.InternationalBanking();

        ICICIBank r = new ICICIBank();
        r=(ICICIBank)ic;
        r.InternationalBanking();
    }


}
