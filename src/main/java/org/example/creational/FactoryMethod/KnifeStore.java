package org.example.creational.FactoryMethod;

public abstract class KnifeStore {
    public Knife orderKnife(String knifeType) {
        Knife knife = null;

        knife = createKnife(knifeType);

        knife.sharpen();
        knife.shine();
        knife.pack();

        return knife;
    }

    abstract Knife createKnife(String knifeType);
}
