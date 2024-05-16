package org.example.structural.Facade;

import java.math.BigDecimal;

public class Customer {
    BankService bankService;
    int mySaving;
    int myInvestment;

    public Customer() {
        this.bankService = new BankService();
    }

    public void createSavingAccount() {
        this.mySaving = this.bankService.createNewAccount("saving", new BigDecimal(500.00));
    }

    public void createInvestmentAccount() {
        this.myInvestment = this.bankService.createNewAccount("investment", new BigDecimal(1000.00));
    }

    public void transferMoneyFromSavingToInvestment(BigDecimal amount) {
        bankService.transferAmount(mySaving, myInvestment, amount);
    }
}
