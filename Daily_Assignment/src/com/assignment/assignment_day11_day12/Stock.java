package com.assignment.assignment_day11_day12;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    String stockName;
    int noOfShare;
    int sharePrice;
    int totalprice;

    public Stock(String stockName, int noOfShare, int sharePrice) {
        this.stockName = stockName;
        this.noOfShare = noOfShare;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfShare() {
        return noOfShare;
    }

    public void setNoOfShare(int noOfShare) {
        this.noOfShare = noOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }



    public String Display() {
        return "StockName='" + stockName + '\'' +
                ", noOfShare=" + noOfShare +
                ", sharePrice=" + sharePrice +
                ",TotalPrice of Share-"+(noOfShare * sharePrice);
    }
}

class StockPortfolio  {
    private List<Stock> list ;

//    public StockPortfolio(String stockName, int noOfShare, int sharePrice) {
//        super(stockName, noOfShare, sharePrice);
//    }


    public StockPortfolio() {
        list=new ArrayList<>();
    }

    public  void addStock(Stock stock) {
        list.add(stock);
    }

    public  ArrayList<Stock> getstock() {
        return (ArrayList<Stock>) list;
    }

}

class Main{

    public static void main(String[] args) {
      StockPortfolio s= new StockPortfolio();

      Stock stock1 = new Stock("Tata",90,50);
      Stock stock2 = new Stock("Tesla",30,35);
      Stock stock3 = new Stock("Google",10,20);
      Stock stock4 = new Stock("Apple",50,100);

      s.addStock(stock1);
      s.addStock(stock2);
      s.addStock(stock3);
      s.addStock(stock4);

      ArrayList<Stock> list = s.getstock();
        for (Stock stock:list) {
            System.out.println(stock.Display());
        }











    }

}
