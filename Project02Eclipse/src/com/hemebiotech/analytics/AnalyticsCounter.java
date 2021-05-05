package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {

	public List<String> start() throws IOException {

		ReadSymptomDataFromFile symptomsData = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		return symptomsData.GetSymptoms();
	}
	public List<String> sort(List<String>tri) {
		Collections.sort(tri);
		return tri;
	}

		// next generate output
		FileWriter writer = new FileWriter("result.out");

		writer.close();

}
