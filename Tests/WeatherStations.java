/*
 * Suppose we have 5 weather stations to capture
 * the temperature readings and compute the main 
 * temperature from the 5 weather stations.
 */

import java.util.*;

public class WeatherStations {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How many weather stations?");
        int num = input.nextInt();
        int count = 1; // To count stations

        float temp, sumTemp = 0;
        while (count < num) {
            System.out.println("Enter temperature for station" + count);
            temp = input.nextFloat();
            sumTemp += temp;
            count++;
        } // end while
        double mean = sumTemp / num;
        System.out.println("Mean Temperature =" + mean);
    }
}
