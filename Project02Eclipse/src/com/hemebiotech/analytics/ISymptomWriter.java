package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface for writing symptoms and their occurrence counts.
 */

public interface ISymptomWriter {
    /**
     * Writes symptoms and their occurrence counts to the output file.
     * @param symptomCounts a map of symptoms and their counts
     */
    void writeSymptoms(Map<String, Integer> symptomCounts);
}
