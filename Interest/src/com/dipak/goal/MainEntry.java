package com.dipak.goal;

import modules.SIP;

public class MainEntry {
    public static void main(String[] args) {
        double principle1 = new SIP().getGrossAfterTime(900000d,72d,100000d,5d,6d);
        //double principle2 = new SIP().getTargetDetails(900000d,10000000d,100000d,5d,6d);
        double principle3 = new SIP().getGrossAfterTime(30000d,72d,15000d,10d,14d);
        System.out.println("From first SIP, principle : "+ String.format("%.2f",principle1));
        System.out.println("From second SIP, principle : "+ String.format("%.2f",principle3));
        System.out.println("Total principle accumulated : "+ String.format("%.2f",(principle1+principle3)));
    }
}
