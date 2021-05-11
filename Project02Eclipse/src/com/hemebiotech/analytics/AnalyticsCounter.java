package com.hemebiotech.analytics;


import java.util.*;
/**
 * <b>the AnalyticsCounter is the class with the program method</b>
 * <p>
 *     we find :
 *     <ul>
 *         <li>the method start</li>
 *         <li>the method sort</li>
 *         <li>the method count</li>
 *         <li>the method write</li>
 *     </ul>
 * </p>
 * @see ReadSymptomDataFromFile
 * @see WriteSymptomData
 * @author Guiles
 */

public class AnalyticsCounter {

	/**
	* @param filepath filepath of the document.txt with symptoms
	* @param dataFile the Arraylist with Symptoms
	* @param countData the Map with Symptoms counted and sorted
	* it's the start of the program who take method one by one
	*/
	private String filepath;
	private List<String> dataFile;
	private Map<String,Integer> countData = new TreeMap<>();

	/**
	 * the course of the program
	 * @param filepath filepath of the document.txt with symptoms
	 */
	public void start(String filepath)  {
		this.filepath = filepath;
		read();
		sort();
		count();
		write();
	}

	/**
	 * read the arraylist include symptoms
	 */
	public void read () {
		ReadSymptomDataFromFile symptomsData = new ReadSymptomDataFromFile(this.filepath);
		dataFile = symptomsData.getSymptoms();
	}
	/**
	 * we sort the ArrayList in alphabetical order
	 */
	public void sort() {
		Collections.sort(dataFile);
	}
	/**
	 * we copy the ArrayList to a TreeMap
	 * we use the TreeMap rather than the HashMap because of the sorting we had been done before
	 */
	public void count (){

		for(int i = 0; i< dataFile.size(); i++){
			if(countData.containsKey(dataFile.get(i))){
		countData.put(dataFile.get(i), countData.get(dataFile.get(i)) + 1);
			} else {
			countData.put(dataFile.get(i), 1);
			}
		}

	}
	/**
	 * Instatiate the WriteSymptomData class
	 * we write the output file
	 */

	public void write () {
		WriteSymptomData writen = new WriteSymptomData();
		writen.write(countData);
	}
}
