package com.hemebiotech.analytics;


import javax.swing.text.html.HTMLDocument;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 * <b>la classe AnalyticsCounter est celle qui contient la corp du code</b>
 * <p>
 *     on y retrouve :
 *     <ul>
 *         <li>la fonction start</li>
 *         <li>la fonction sort</li>
 *         <li>la fonction count</li>
 *         <li>la fonction write</li>
 *     </ul>
 * </p>
 * @see ReadSymptomDataFromFile
 * @author Guiles
 */

public class AnalyticsCounter {

	/**
	* c'est le point de départ du programme
	* on va chercher la class ReadSympomDataFromFile et on l'instancie ici en lui indiquant le chemin du .txt
	* @return le ArrayList créé a partir du fichier.txt
	*/
	public List<String> start()  {
		ReadSymptomDataFromFile symptomsData = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		return symptomsData.GetSymptoms();
	}

	/**
	 * @param tri
	 * 			Le nom de la liste triée
	 * on tri le ArrayList par ordre alphabetique
	 * @return le Arraylist trié alphabétiquement
	 */
	public List<String> sort(List<String> tri) {
		Collections.sort(tri);
		return tri;
	}
	/**
	 * @param alpha
	 * on copie le array sur un treemap
	 * @return le Map trié par ordre alphabetique et comptabilisé
	 */
	public Map<String, Integer> count (List<String> alpha){
		//on crée le TreeMap
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
	 * on écrit le fichier de sortie en y incluant les exceptions
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
	}
}
