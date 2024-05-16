package org.example.structural.Facade;

import java.math.BigDecimal;

public interface IAccount {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount account, BigDecimal amount);
    public int getAccountNumber();
}
