package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
/**
 * <b>the louncher class contain the main method</b>
 * <p>
 *     we get the AnalyticsCounter method :
 *     <ul>
 *         <li> start</li>
 *         <li> sort</li>
 *         <li> count</li>
 *         <li> write</li>
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
        * we take the information from the ArrayList
        */
        List<String>arrayRecup = analyticsCounter.start();
        System.out.println(arrayRecup);

        /**
        * we take the list sorted in alphabetical order
        */
        arrayRecup = analyticsCounter.sort(arrayRecup);
        System.out.println(arrayRecup);

        /**
        * @param mapRecup
        * we take the counted treemap
        */
        Map<String, Integer> mapRecup = analyticsCounter.count(arrayRecup);
        System.out.println(mapRecup);

        /**
        * we write the output file
        */
        analyticsCounter.write(mapRecup);
    }
}
