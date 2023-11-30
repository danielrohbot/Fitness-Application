/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Amanda
 * Section: 9am
 * Date: 11/30/23
 * Time: 3:59 PM
 *
 * Project: csci205_final_project
 * Package: org.team1
 * Class: ConversionUtil
 *
 * Description:
 *
 * ****************************************
 */
package org.team1;

public class ConversionUtil {
    public static double convertSpeedToMeters(double speed, String unit) {
        switch (unit) {
            case "Miles per Hour":
                return speed * 0.44704;
            case "Meters per Second":
                return speed ;
            case "Kilometers per Hour":
                return speed * 0.277778;
            default:
                throw new IllegalArgumentException("Invalid speed unit");
        }
    }

    public static double convertWeightToKg(double weight, String unit) {
        switch (unit) {
            case "Kilograms(kg)":
                return weight;
            case "Pound (lb)":
                return weight * 2.20462;
            default:
                throw new IllegalArgumentException("Invalid distance unit");
        }
    }

    public static double convertHeightToMeters(double height, String unit) {
        switch (unit) {
            case "inches(in)":
                return height * 0.0254;
            case "centimeters(cm)":
                return height * 0.01;
            default:
                throw new IllegalArgumentException("Invalid distance unit");
        }
    }
}

