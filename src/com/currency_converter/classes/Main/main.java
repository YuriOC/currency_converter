package com.currency_converter.classes.Main;

import com.currency_converter.classes.Coins.Coins;
import com.currency_converter.classes.Requests.Requests;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class main {
    static void main() throws IOException, InterruptedException {
        Coins coin = new Coins();
        Scanner s = new Scanner(System.in);
        System.out.println("=============== CURRENCY CONVERTER ===============");
        System.out.println("Choose your First Coin (3 digits)");
        coin.setCoin1(s.next());
        System.out.println("Choose your Second Coin (3 digits)");
        coin.setCoin2(s.next());
        if (coin.getCoin1().length() != 3 || coin.getCoin2().length() != 3 ||
                coin.getCoin1().matches(".*\\d.*") || coin.getCoin2().matches(".*\\d.*") ||
                coin.getCoin1().matches(".*\\W.*") || coin.getCoin2().matches(".*\\W.*")){
            System.out.println("Invalid coin(s)");
        } else {
            try{
                System.out.println("Choose the amount");
                coin.setAmount(s.next());

                Requests request = new Requests(coin.getCoin1(), coin.getCoin2());
                coin.setConRate(request.getConRate());

                System.out.println("Total value for " + coin.getCoin1().toUpperCase() + " to " + coin.getCoin2().toUpperCase() + " is " +
                        coin.totalValue() + " with conversion rate of: " + request.getConRate());
            } catch (Exception e) {
                System.out.println(e.getMessage() + ": Invalid Amount");
            }
        }
    }
}
