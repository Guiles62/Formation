package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
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
 * @author Guiles
 */

public class AnalyticsCounter {

	/**
	* it's the start of the program
	* we will look for the ReadSympomDataFromFile class and we instantiate it here by indicating the path of the file.txt
	* @return the ArrayList create with the file.txt
	*/
	public static List<String> start()  {
		ReadSymptomDataFromFile symptomsData = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		return symptomsData.getSymptoms();
	}

	/**
	 * @param tri
	 * 			the name of the sorted list
	 * we sort the ArrayList in alphabetical order
	 * @return the sorted list
	 */
	public List<String> sort(List<String> tri) {
		Collections.sort(tri);
		return tri;
	}
	/**
	 * @param alpha
	 * we copy the ArrayList to a TreeMap
	 * we use the TreeMap rather than the HashMap because of the sorting we had been done before
	 * @return the Map sorts in alphabetical order and counted
	 */
	public Map<String, Integer> count (List<String> alpha){
		//on cree le TreeMap
		Map<String, Integer> listAlpha = new TreeMap<>();
		// on comptabilise les symtomes en les ajoutant au TreeMap
		for( int i = 0; i<alpha.size(); i++){
		if(listAlpha.containsKey(alpha.get(i))){
		listAlpha.put(alpha.get(i), listAlpha.get(alpha.get(i)) + 1);
		} else {
			listAlpha.put(alpha.get(i), 1);
		}
		}
		return listAlpha;
	}
	/** @param writen
	 * we write the output file including the exceptions
	 * exception IOException
	 * triggered if the result.out file has not been generated
	 */
	public void write (Map<String, Integer> writen)  {
		try {
			FileWriter writer = new FileWriter("result.out");
			// on prend les index les uns après les autres
			for (Map.Entry<String, Integer> entry : writen.entrySet()) {
			// on écrit chaque clé et valeur avec un /n
				writer.write((entry.getKey() + " : " + entry.getValue()) + "\n");
			}
			writer.close();
		} catch ( IOException exception) {
			System.out.println("Le fichier n'a pas pu être écrit ");
		}
	} // mettre un finally ???
}
