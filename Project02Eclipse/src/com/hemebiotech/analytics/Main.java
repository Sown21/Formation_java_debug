package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Entry point of the application.
 */

public class Main {
    /**
     * Main method that executes the steps (reading, counting, writing).
     * @param args command line arguments
     */
    public static void main(String[] args) {
        ISymptomReader reader = new readSymptomDataFromFile("../symptoms.txt");
        ISymptomWriter writer = new writeSymptomDataToFile("result.out");
        AnalyticsCounter counter = new AnalyticsCounter(reader, writer);

        List<String> symptoms = counter.getAllSymptoms();
        Map<String, Integer> countSymptoms = counter.countSymptoms(symptoms);
        counter.writeSymptoms(countSymptoms);
    }
}
