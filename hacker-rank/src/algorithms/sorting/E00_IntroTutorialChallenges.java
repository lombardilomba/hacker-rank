package algorithms.sorting;

import java.util.Scanner;

public class E00_IntroTutorialChallenges {
    
    // https://www.hackerrank.com/challenges/tutorial-intro/problem
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = Integer.parseInt(in.nextLine());
        int n = Integer.parseInt(in.nextLine());
        int[] ar = new int[n];
        
        String numbers = in.nextLine();
        String[] split = numbers.split(" ");
        
        for(int i = 0; i < split.length; i++ )
            ar[i] = Integer.parseInt(split[i]);
        
        in.close();
        
        for(int i = 0; i < ar.length; i++) {
            if(v == ar[i])
                System.out.println(i);
        }
    }
    
}