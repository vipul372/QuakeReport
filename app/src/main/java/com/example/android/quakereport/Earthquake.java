package com.example.android.quakereport;

import java.lang.ref.SoftReference;

public class Earthquake {

        private double mag;
        private String location;
        private long unixTime;
        private String url;

    public Earthquake(double mag, String location, long unixTime, String url) {
        this.mag = mag;
        this.location = location;
        this.unixTime = unixTime;
        this.url = url;
    }

    public double getMag() {
        return mag;
    }

    public String getLocation() {
        return location;
    }

    public long getUnixTime() {
        return unixTime;
    }

    public String getUrl() {
        return url;
    }
}

