package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface pour l'ecriture des symptomes et leur nombre d'occurences
 */

public interface ISymptomWriter {
    /**
     * Ecrit les symptomes et leurs occurences dans le fichier output
     * @param symptomCounts
     */
    void writeSymptoms(Map<String, Integer> symptomCounts);
}
