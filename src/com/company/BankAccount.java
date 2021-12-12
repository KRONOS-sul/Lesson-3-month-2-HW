package com.company;

import java.util.Scanner;

public class BankAccount {
    private double amount;
    Scanner scanner = new Scanner(System.in);

    public double getAmount() {
        return amount;
    }

    public void deposit(Double sum) {
        amount = amount + sum;
        System.out.println("You put: " + sum + "$\nOn your bank account: " + getAmount());
    }

    void withDraw(Integer sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("У вас недостаточно средств на счёте\nУ вас осталось: ", amount);
        } else {
            amount = amount - sum;
            System.out.println("You withdrew: " + sum + "$ from your bank account\n" +
                    "Reamins: " + getAmount());
        }
    }
}
