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

        System.out.println("Choose your First Coin");
        coin.setCoin1(s.next());
        System.out.println("Choose your Second Coin");
        coin.setCoin2(s.next());
        System.out.println("Choose the amount");
        coin.setAmount(s.next());

        Requests request = new Requests(coin.getCoin1(), coin.getCoin2());
        coin.setConRate(request.getConRate());

        System.out.println("Total value for " + coin.getCoin1() + " to " + coin.getCoin2() + " is " +
                coin.totalValue() + " with conversation rate of: " + request.getConRate());
        
    }
}
