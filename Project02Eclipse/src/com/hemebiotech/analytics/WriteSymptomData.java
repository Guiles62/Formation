package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * It's the class for write the final file with exception
 * @param write
 */

public class WriteSymptomData {

    public void write(Map<String, Integer> writen) {
        FileWriter writer = null;
            try {
                writer = new FileWriter("result.out");
                // on prend les index les uns après les autres
                for (Map.Entry<String, Integer> entry : writen.entrySet()) {
                    // on écrit chaque clé et valeur avec un \n
                    writer.write((entry.getKey() + " : " + entry.getValue()) + "\n");
                }
                writer.close();
            } catch (IOException exception) {
                System.out.println("Le fichier n'a pas pu être écrit ");
            } finally {
                try {
                writer.close();
                } catch (IOException exception) {
                    System.out.println("Le fichier n'a pas pu être fermé ");
                }
            }
        }

}
