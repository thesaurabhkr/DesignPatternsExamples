package org.example.structural.Facade;

import java.math.BigDecimal;

public class Chequing implements IAccount{
    private BigDecimal amount;
    public Chequing(BigDecimal initAmount) {
        this.amount = initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(IAccount account, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}