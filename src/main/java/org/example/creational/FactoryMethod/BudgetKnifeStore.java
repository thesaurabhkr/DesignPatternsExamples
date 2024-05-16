package org.example.creational.FactoryMethod;

public class BudgetKnifeStore extends KnifeStore{
    @Override
    Knife createKnife(String knifeType) {
        Knife knife = null;
        if(knifeType.equals("Steak")) {
            knife = new SteakKnife();
        } else {
            // Other type
        }
        return knife;
    }
}
