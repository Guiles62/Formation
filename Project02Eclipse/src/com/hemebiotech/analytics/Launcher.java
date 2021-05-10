package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
/**
 * <b>la classe launcher est celle qui contient la fonction main</b>
 * <p>
 *     on y retrouve :
 *     <ul>
 *         <li>la fonction start</li>
 *         <li>la fonction sort</li>
 *         <li>la fonction count</li>
 *         <li>la fonction write</li>
 *     </ul>
 * </p>
 * @see AnalyticsCounter
 * @author Guiles
 */
public class Launcher {
    public static void main(String[] args)  {

        // @param instantiation de la class AnalyticsCounter
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();

        /**
        *   @param arrayRecup
        * on va chercher les informations du ArrayList
        */
        List<String>arrayRecup = analyticsCounter.start();
        System.out.println(arrayRecup);

        /**
        * on va chercher la list triee par ordre alpha
        */
        arrayRecup = analyticsCounter.sort(arrayRecup);
        System.out.println(arrayRecup);

        /**
        * @param mapRecup
        * on va chercher le treemap compte
        */
        Map<String, Integer> mapRecup = analyticsCounter.count(arrayRecup);
        System.out.println(mapRecup);

        /**
        * on ecrit la fichier de sortie
        */
        analyticsCounter.write(mapRecup);
    }
}
