package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	
	public static void main(String args[]) throws Exception {
		Map<String, Integer> symptomCounts = new TreeMap<>();

		try (BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isEmpty()) {
                    symptomCounts.put(line, symptomCounts.getOrDefault(line, 0) + 1);
                }
            }
		} catch (IOException e) {
            System.err.println("Error reading symptoms file: " + e.getMessage());
        }
        System.out.println(symptomCounts);
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
