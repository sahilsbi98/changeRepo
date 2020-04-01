package com.example.recyclerview.smt;

public class Service {

    private String service;
    private String rate;
    private String category;
    private String rating;
    private String distance;
    private String url;
    private String provider;

    public Service(String service, String rate, String category, String rating, String distance, String url, String provider) {
        this.service = service;
        this.rate = rate;
        this.category = category;
        this.rating = rating;
        this.distance = distance;
        this.url = url;
        this.provider = provider;
    }

    public String getService() {
        return service;
    }

    public String getRate() {
        return rate;
    }

    public String getCategory() {
        return category;
    }

    public String getRating() {
        return rating;
    }

    public String getDistance() {
        return distance;
    }

    public String getUrl() {
        return url;
    }

    public String getProvider() {
        return provider;
    }
}
