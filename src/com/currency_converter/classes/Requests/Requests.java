package com.currency_converter.classes.Requests;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requests {
    private String coin1;
    private String coin2;

    public Requests(String coinx, String coiny) throws IOException, InterruptedException {

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/API_KEY/pair/" + coinx + "/" + coiny))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public String getCoin1() {
        return coin1;
    }

    public String getCoin2() {
        return coin2;
    }
}
