package com.currency_converter.classes.Main;

import com.currency_converter.classes.Requests.Requests;

import java.io.IOException;

public class main {
    static void main() throws IOException, InterruptedException {
        Requests request = new Requests("BRL", "USD");
    }
}
