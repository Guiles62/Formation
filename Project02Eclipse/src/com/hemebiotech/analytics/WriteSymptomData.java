package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * It's the class for write the final file with exception
 * @exception
 */

public class WriteSymptomData {
    /**
     * @param writen the data which will write on the out file
     */
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
                System.out.println("can't write the file ");
            } finally {
                try {
                writer.close();
                } catch (IOException exception) {
                    System.out.println("can't close FileWriter ");
                }
            }
        }

}
