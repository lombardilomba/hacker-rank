package algorithms.machine.learning;

import java.util.Scanner;

public class E03_BatteryProblem {
    // https://www.hackerrank.com/challenges/battery/problem
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double timeCharged = in.nextDouble();
        in.close();
        //Equação Polinomial de ordem 5
        double result = (-0.001 * Math.pow(timeCharged, 5)) + (0.0307 * Math.pow(timeCharged, 4)) - (0.3078 * Math.pow(timeCharged, 3)) + (1.0207 * Math.pow(timeCharged, 2)) + (1.025 * timeCharged);
        
        System.out.println(String.valueOf(result).substring(0,4));
        
    }
    
}