package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Implementation de ISymptomWriter qui ecrit le symptomes et leurs occurences dans un fichier
 */

public class writeSymptomDataToFile implements ISymptomWriter {
    private String finalPath;

    /**
     * Constructeur pour ecrire les resultat dans un fichier
     * @param finalPath fichier output
     */

    public writeSymptomDataToFile(String finalPath) {
        this.finalPath = finalPath;
    }

    /**
     * Ecrit chaque symptomes et occurence dans le fichier output
     * @param symptoms
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
