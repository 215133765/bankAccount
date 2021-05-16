/**
 * Mziyanda Mwanda
 * 215133765
 * ADP 3
 * Assignment 2
 * 16 May 2021
 * **/
package za.ac.cput;

import java.util.Objects;

public class savingsAccount {
    private int id;
    private String name, surname ;
    private long accountNumber;
    private double amount, deposit;


    public savingsAccount(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double totalAmount(double currentAmount){
        currentAmount = amount ;

        return currentAmount;
    }

    public void amountDeposited(double dep){
        dep = deposit;
        if (dep < 0 || dep == 0 ){
            System.out.println("Invalid please try to deposit a ring amount.");
        } else {
            System.out.println(dep + "amount was successfully deposited into your saving account");
        }
    }

    @Override
    public String toString() {
        return "savingsAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", deposit=" + deposit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof savingsAccount)) return false;
        savingsAccount that = (savingsAccount) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
