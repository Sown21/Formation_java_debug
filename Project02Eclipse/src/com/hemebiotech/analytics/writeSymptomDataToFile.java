package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
/**
 * Implementation of ISymptomWriter that writes symptoms and their occurrence counts to a file.
 */

public class writeSymptomDataToFile implements ISymptomWriter {
    private String finalPath;

    /**
     * Constructor to specify the output file path.
     * @param finalPath the output file path
     */

    public writeSymptomDataToFile(String finalPath) {
        this.finalPath = finalPath;
    }

    /**
     * Writes each symptom and its occurrence count to the output file.
     * @param symptoms the map of symptoms and their counts
     */

    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {
        try {
            FileWriter writer = new FileWriter (finalPath);
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
