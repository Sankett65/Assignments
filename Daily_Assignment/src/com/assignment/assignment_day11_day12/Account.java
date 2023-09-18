package com.assignment.assignment_day11_day12;

import java.util.ArrayList;
import java.util.List;

public class Account {
    String bankName;
    int accountNo;
    int balance;
    int debit;
    int withdraw;



    public Account(int accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public Account() {
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = balance-debit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = balance-withdraw;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public String diaplay() {
        return "Account Number=" + accountNo +
                ", "+"Balnce=" + balance;
    }
}


    class Bank extends Account{
       static List<Account> list=new ArrayList<>() ;

        public Bank() {

        }

        public static void addAccount(Account account){
            list.add(account);
        }

        public  void debit(int accountNo,int debit){
      for (int i =0;i<list.size();i++){
          if (list.get(i).balance<debit){
              System.out.println("Your Bank Account does not have a sufficient balance");break;
          }
          else if (list.get(i).accountNo==accountNo){
              int temp = list.get(i).balance;
              list.get(i).setBalance(temp-debit);
              System.out.println("After Debiting from account No: "+accountNo);
              System.out.println(list.get(i).diaplay());
              break;
          }
      }
        }
        public static List<Account> getList() {
            return list;
        }

        public static void main(String[] args) {

            Bank b = new Bank();
        Account ac= new Account(255362,5000);
        Account ac1= new Account(58762,1000);
        Account ac2= new Account(98732,500);
        Account ac3= new Account(129366,100);

            b.addAccount(ac);
            b.addAccount(ac1);
            b.addAccount(ac2);
            b.addAccount(ac3);



        ArrayList<Account> list = (ArrayList<Account>) b.getList();

        for (Account account:list ){
            System.out.println(account.diaplay());
        }

            System.out.println();

        b.debit(58762,500);









        }


}
