package com.hemebiotech.analytics;

import java.util.List;

public class Launcher {
    public static void main(String args[]) throws Exception {
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        List<String>arrayRecup = analyticsCounter.start();
        System.out.println(arrayRecup);


    }
}
