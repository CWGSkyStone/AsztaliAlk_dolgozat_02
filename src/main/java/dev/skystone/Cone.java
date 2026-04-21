/*
* File: Cone.java
* Author: Szabó József
* Copyright: 2026, Szabó József
* Group: Szoft I/N
* Date: 2026-04-21
* Github: https://github.com/CWGSkyStone
* Licenc: MIT
*/

package dev.skystone;

public class Cone {
    static double calcVolume(double height, double firstRadius, double secondRadius){ 
        return (Math.PI * firstRadius * secondRadius * height) / 3; 
    }
}
