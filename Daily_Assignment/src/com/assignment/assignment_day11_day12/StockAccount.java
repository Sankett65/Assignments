package com.assignment.assignment_day11_day12;

import java.util.ArrayList;
import java.util.List;

//
//- StockAccount.java implements a data type that
//        might be used by a financial institution to keep track of customer information. The
//        StockAccount class implements following methods
//
//        The StockAccount class also maintains a list of CompanyShares objects
//        which have Stock Symbol and Number of Shares as well as DateTime of the
//        transaction. When buy or sell is initiated StockAccount checks if
//        CompanyShares are available and accordingly update or create an Object.
 class CompanyShare {
    String symbol;
    int noOfShare;
    String dateTime;

    public CompanyShare(String symbol, int noOfShare, String dateTime) {
        this.symbol = symbol;
        this.noOfShare = noOfShare;
        this.dateTime = dateTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "CompanyShare{" +
                "symbol='" + symbol + '\'' +
                ", noOfShare=" + noOfShare +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
public class StockAccount{
    List<CompanyShare> company;

    public StockAccount() {
        company=new ArrayList<>();
    }


    public void buyStock(CompanyShare share){
        company.add(share);
    }

    public void deleteShare(String csymbol, int cnoOfShare, String dateTime){
        for (int i =0;i<company.size();i++){
            if (company.get(i).symbol==csymbol){
                company.get(i).noOfShare-=cnoOfShare;
            }
        }
    }

    public List<CompanyShare> getCompanyShare(){
        return company;
    }

    public static void main(String[] args) {
        StockAccount s = new StockAccount();
        s.buyStock(new CompanyShare("Hello",100,"11-09-2001 /10:30"));
        s.buyStock(new CompanyShare("Sanket",50,"30-10-2023 /12:30"));
        s.buyStock(new CompanyShare("Hi",25,"1-12-2021 /11:40"));

        List<CompanyShare> company=s.getCompanyShare();
        for (CompanyShare share:company){
            System.out.println(share);
        }
     s.deleteShare("Hello",50,"03-09-2001 /12:00");
        System.out.println();
        for (CompanyShare share:company){
            System.out.println(share);
        }

    }
}
