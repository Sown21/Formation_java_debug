package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Classe principale qui effectue l'analyse des symptomes (lecture / comptage / ecriture)
 */

public class AnalyticsCounter {
    private final ISymptomReader reader;
    private final ISymptomWriter writer;

    /**
     * Créé un objet AnalyticsCounter
      * @param reader pour lire les symptomes
     * @param writer pour écrire dans le fichier output
     */

    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    /**
     * Recupère la liste de tous les symptomes
     * @return la liste String des symptomes
     */

    public List<String> getAllSymptoms() {
        return reader.getSymptoms();
    }

    /**
     * Compte le nombre d'occurences de chaque symptomes dans la map
     * @param symptoms
     * @return une map <symptomes, nombre d'occurence>
     */

    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        Map<String, Integer> count = new TreeMap<>();
        for (String symptom : symptoms) {
            count.put(symptom, count.getOrDefault(symptom, 0) + 1);
        }
        return count;
    }

    /**
     * Ecrit les résultas dans le fichier output
     * @param symptoms recupère la map de countSymptoms
     */

    public void writeSymptoms(Map<String, Integer> symptoms) {
        writer.writeSymptoms(symptoms);
    }
}
