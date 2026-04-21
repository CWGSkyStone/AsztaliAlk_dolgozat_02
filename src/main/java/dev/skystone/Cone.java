package dev.skystone;

public class Cone {
    static double calcVolume(double height, double firstRadius, double secondRadius){ 
        return (Math.PI * firstRadius * secondRadius * height) / 3; 
    }
}
