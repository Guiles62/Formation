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
	* @param start
	* it's the start of the program who take method one by one
	* we will look for the ReadSympomDataFromFile class and we instantiate it here by indicating the path of the file.txt
	*/
	private String filepath;
	private List<String> dataFile;
	private Map<String,Integer> countData = new TreeMap<>();

	public void start(String filepath)  {
		this.filepath = filepath;
		read();
		sort();
		count();
		write();
	}

	/**@param read
	 * read the arraylist include symptoms
	 */
	public void read () {
		ReadSymptomDataFromFile symptomsData = new ReadSymptomDataFromFile(this.filepath);
		dataFile = symptomsData.getSymptoms();
	}
	/**
	 * @param sort
	 * we sort the ArrayList in alphabetical order
	 */
	public void sort() {
		Collections.sort(dataFile);
	}
	/**
	 * @param count
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
	/** @param write
	 * Instatiate the WriteSymptomData class
	 * we write the output file
	 */

	public void write () {
		WriteSymptomData writen = new WriteSymptomData();
		writen.write(countData);
	}
}
