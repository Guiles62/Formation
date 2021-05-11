package com.hemebiotech.analytics;




/** It's the launcher of the program with a only one method
 * instatiate the AnalyticsCounter class
 * @see AnalyticsCounter
 */


public class Launcher {
    /**
     * The main method for execute the program
     * @param args
     */
    public static void main(String[] args)  {
        // @param instantiation de la class AnalyticsCounter
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        analyticsCounter.start("Project02Eclipse/symptoms.txt");

    }
}
