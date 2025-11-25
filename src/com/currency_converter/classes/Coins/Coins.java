package com.currency_converter.classes.Coins;

public class Coins {
    private String coin1;
    private String coin2;
    private double conRate;
    private double amount;

    public double totalValue(){
        return this.conRate * this.amount;
    }

    public String getCoin1() {
        return coin1;
    }

    public void setCoin1(String coin1) {
        this.coin1 = coin1;
    }

    public String getCoin2() {
        return coin2;
    }

    public void setCoin2(String coin2) {
        this.coin2 = coin2;
    }


    public double getConRate(double conRate) {
        return this.conRate;
    }

    public void setConRate(double conRate) {
        this.conRate = conRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = Double.parseDouble(amount);
    }
}
