package org.example;

import org.springframework.stereotype.Component;


public class Passport /*=> class toLowerCase*/ {
    private String series = "uasdfhagsfdhafhdgsaf";

    public Passport(String series) {
        this.series = series;
    }

    public Passport() {
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                '}';
    }
}
