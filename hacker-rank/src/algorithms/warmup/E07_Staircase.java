package algorithms.warmup;

import java.util.Scanner;

public class E07_Staircase {

    // https://www.hackerrank.com/challenges/staircase

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int hash = 1;
        
        for(int i = n ; i > 0; i--) {
            
            String line = "";
            for(int j = 0; j < (i - 1); j++)
                line = line + " ";
            
            String hashs = "";
            for(int j = 0; j < hash; j++)
                hashs  = hashs + "#";
            
            hash++;
            System.out.println(line+hashs);
            
        }
    }
    
}