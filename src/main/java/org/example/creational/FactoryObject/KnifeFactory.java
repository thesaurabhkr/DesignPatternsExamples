package org.example.creational.FactoryObject;

public class KnifeFactory {
    public Knife createKnife(String knifeType) {
        Knife knife = null;

        if(knifeType.equals("Steak")) {
            knife = new SteakKnife();
        } else {
            // Other type
        }
        return knife;
    }
}
