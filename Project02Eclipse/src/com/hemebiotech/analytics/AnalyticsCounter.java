package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Main class that performs symptom analysis (reading, counting, writing).
 */

public class AnalyticsCounter {
    private final ISymptomReader reader;
    private final ISymptomWriter writer;

    /**
     * Creates an AnalyticsCounter object.
     * @param reader to read symptoms
     * @param writer to write results to output file
     */

    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    /**
     * Retrieves the list of all symptoms.
     * @return a list of symptom strings
     */

    public List<String> getAllSymptoms() {
        return reader.getSymptoms();
    }

    /**
     * Counts the occurrences of each symptom.
     * @param symptoms the list of symptoms
     * @return a map with symptoms as keys and their occurrence counts as values
     */

    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> count = new TreeMap<>();
        for (String symptom : symptoms) {
            count.put(symptom, count.getOrDefault(symptom, 0) + 1);
        }
        return count;
    }

    /**
     * Writes the results to the output file.
     * @param symptoms the map returned by countSymptoms
     */

    public void writeSymptoms(Map<String, Integer> symptoms) {
        writer.writeSymptoms(symptoms);
    }
}
