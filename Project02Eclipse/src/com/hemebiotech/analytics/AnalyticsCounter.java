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
	private List<String> arrayList;
	private Map<String,Integer> tri = new TreeMap<>();

	public void start(String filepath)  {
		this.filepath = filepath;
		ReadSymptomDataFromFile symptomsData = new ReadSymptomDataFromFile(this.filepath);
		arrayList = symptomsData.getSymptoms();
		sort();
		count();
		write();
	}
	/**
	 * @param sort
	 * we sort the ArrayList in alphabetical order
	 */
	public void sort() {
		Collections.sort(arrayList);
	}
	/**
	 * @param count
	 * we copy the ArrayList to a TreeMap
	 * we use the TreeMap rather than the HashMap because of the sorting we had been done before
	 */
	public void count (){

		for(int i = 0; i< arrayList.size(); i++){
		if(tri.containsKey(arrayList.get(i))){
		tri.put(arrayList.get(i), tri.get(arrayList.get(i)) + 1);
		} else {
			tri.put(arrayList.get(i), 1);
		}
		}

	}
	/** @param write
	 * Instatiate the WriteSymptomData class
	 * we write the output file
	 */

	public void write () {
		WriteSymptomData writen = new WriteSymptomData();
		writen.write(tri);
	}
}
