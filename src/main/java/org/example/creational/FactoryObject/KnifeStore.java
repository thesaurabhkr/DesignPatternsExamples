package org.example.creational.FactoryObject;

public class KnifeStore {
    private KnifeFactory knifeFactory;

    public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }

    public Knife orderKnife(String knifeType) {
        Knife knife = null;

        // Using the knife factory method for creating knifes
        knife = knifeFactory.createKnife(knifeType);

        knife.sharpen();
        knife.shine();
        knife.pack();

        return knife;
    }
}
