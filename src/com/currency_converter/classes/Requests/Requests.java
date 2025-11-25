package com.currency_converter.classes.Requests;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requests {
    private double conRate;

    public Requests(String coinx, String coiny) throws IOException, InterruptedException {

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/API_KEY/pair/" + coinx + "/" + coiny))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JsonElement element = JsonParser.parseString(response.body());
            JsonObject object = element.getAsJsonObject();
            conRate = object.get("conversion_rate").getAsDouble();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double getConRate() {
        return this.conRate;
    }
}
