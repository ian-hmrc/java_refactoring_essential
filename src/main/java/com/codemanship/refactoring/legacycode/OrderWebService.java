package com.codemanship.refactoring.legacycode;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OrderWebService implements OrderService {
    final ObjectMapper objectMapper = new ObjectMapper();
    final HttpClient httpClient = HttpClient.newHttpClient();

    public OrderWebService() {
    }

    @Override
    public Order getOrder(int orderId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(
                        "https://codemanship.co.uk/api/orders.php?orderId=" + orderId
                ))
                .GET()
                .build();

        HttpResponse<String> response =
                httpClient.send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                );

        String json = response.body();

        Order order =
                objectMapper.readValue(json, Order.class);

        System.out.println("Order: weight: " + order.getWeightKg() + ", type: " + order.getShippingType() + ", distance: " + order.getDistanceKm());
        return order;
    }
}