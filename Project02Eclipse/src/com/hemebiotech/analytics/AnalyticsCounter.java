package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	/*private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;*/

	public void start() throws IOException {
		// first get input
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\guile\\Desktop\\Formation\\P2_travaux\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
		String line = reader.readLine();

		int i = 0;    // set i to 0
		/*int headCount = 0;    // counts headaches*/
		while (line != null) {
			i++;
			line = reader.readLine();    // get another symptom
			System.out.println("symptom from file: " + line);
			/*if (line.equals("headache")) {
				headCount++;

			} else if (line.equals("rush")) {
				rashCount++;
			} else if (line.contains("pupils")) {
				pupilCount++;
			}*/


		}

		// next generate output
		FileWriter writer = new FileWriter("result.out");


		/*writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");*/
		writer.close();
	}
}
