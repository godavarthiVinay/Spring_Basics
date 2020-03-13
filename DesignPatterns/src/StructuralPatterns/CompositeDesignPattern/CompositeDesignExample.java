package StructuralPatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

abstract class Account{
    public abstract float getBalance();
}

class DepositeAccount extends Account {
    private String accountNo;
    private float accountBal;
    public DepositeAccount(String accountNo,float accountBal){

        this.accountNo=accountNo;
        this.accountBal=accountBal;
    }



    @Override
    public float getBalance() {
        return accountBal;
    }
}

class SavingsAccount extends Account {
    private String accountNo;
    private float accBal;

    public SavingsAccount(String accountNo,float accBal){
        this.accountNo=accountNo;
        this.accBal=accBal;
    }

    @Override
    public float getBalance() {
        return accBal;
    }
}

class CompositeAccount extends Account {
    private float totalAmt;
    private List<Account> accountList=new ArrayList<Account>();

    public void addAccount(Account ac){
        accountList.add(ac);
    }

    @Override
    public float getBalance() {
        totalAmt=0;
        for(Account account:accountList){
            totalAmt=totalAmt+account.getBalance();
        }
        return totalAmt;
    }
}


public class CompositeDesignExample {


    /*
    * StructuralDesign Pattern
    *Composite lets client treat individual object(Leaf) and compositions of object(Composite)Uniformly
    * Four Participants:Components,Leaf,Composite,Client
    *
    *IMPLEMENTATION:
    * Component:Account class,which contains common methods
    * Leaf:DepositeAccount and SavingsAccount
    * Composite:CompositeAccount
    * Client:Client class
    *
    *
    * */
    public static void main(String[] args){
        CompositeAccount compositeAccount=new CompositeAccount();
        compositeAccount.addAccount(new DepositeAccount("DA1",5000.00f));
        compositeAccount.addAccount(new DepositeAccount("DA2",4000.00f));
        compositeAccount.addAccount(new SavingsAccount("SA1",3000.00f));

        float totalBal=compositeAccount.getBalance();
        System.out.println("totol Bal :"+totalBal);


    }
}

