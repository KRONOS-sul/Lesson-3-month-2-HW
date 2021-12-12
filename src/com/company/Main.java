package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(3100.0);
        while (true){
            try {
                bankAccount.withDraw(750);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                int balance = (int) bankAccount.getAmount();
                try {
                    bankAccount.withDraw(balance);
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }

                break;
            }

        }

    }
}
