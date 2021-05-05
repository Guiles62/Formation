package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Launcher {
    public static void main(String[] args) throws IOException {
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        List<String>arrayRecup = analyticsCounter.start();
        System.out.println(arrayRecup);
        arrayRecup = analyticsCounter.sort(arrayRecup);
        System.out.println(arrayRecup);
        Map<String, Integer> mapRecup = analyticsCounter.count(arrayRecup);
        System.out.println(mapRecup);
        analyticsCounter.write(mapRecup);
    }
}
