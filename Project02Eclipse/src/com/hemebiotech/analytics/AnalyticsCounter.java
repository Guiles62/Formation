package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class AnalyticsCounter {

	public AnalyticsCounter() throws IOException {
	}

	public List<String> start()  {

		ReadSymptomDataFromFile symptomsData = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		return symptomsData.GetSymptoms();
	}
	public List<String> sort(List<String> tri) {
		Collections.sort(tri);
		return tri;
	}
	public Map<String, Integer> count (List<String> alpha){
		Map<String, Integer> listAlpha = new TreeMap<>();
		for( int i = 0; i<alpha.size(); i++){
		if(listAlpha.containsKey(alpha.get(i))){
		listAlpha.put(alpha.get(i), listAlpha.get(alpha.get(i)) + 1);
		} else {
			listAlpha.put(alpha.get(i), 1);
		}
		}
		return listAlpha;
	}

	public void write (Map<String, Integer> writen) throws IOException {
		FileWriter writer = new FileWriter("result.out");
		writer.write(String.valueOf(writen));
		writer.close();
	}
}
