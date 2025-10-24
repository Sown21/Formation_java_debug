package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ISymptomReader reader = new readSymptomDataFromFile("symptoms.txt");
        ISymptomWriter writer = new writeSymptomDataToFile("result.out");
        AnalyticsCounter counter = new AnalyticsCounter(reader, writer);

        List<String> symptoms = counter.getAllSymptoms();
        System.out.println(symptoms);
        Map<String, Integer> countSymptoms = counter.countSymptoms(symptoms);
        System.out.println(countSymptoms);

        counter.writeSymptoms(countSymptoms);
    }
}
