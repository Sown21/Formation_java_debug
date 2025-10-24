package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Point d'enrée
 */

public class Main {
    /**
     * Methode principale qui execute les differentes etapes ( lecture / comptage / ecriture )
     * @param args
     */
    public static void main(String[] args) {
        ISymptomReader reader = new readSymptomDataFromFile("symptoms.txt");
        ISymptomWriter writer = new writeSymptomDataToFile("result.out");
        AnalyticsCounter counter = new AnalyticsCounter(reader, writer);

        List<String> symptoms = counter.getAllSymptoms();
        Map<String, Integer> countSymptoms = counter.countSymptoms(symptoms);
        counter.writeSymptoms(countSymptoms);
    }
}
