package algorithms.warmup;

import java.util.Scanner;

public class E13_CamelCase {

    // https://www.hackerrank.com/challenges/camelcase
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        int countUpper = 0;
        char[] chars = s.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            for(int j = 0; j < alphabet.length; j++ ) {
                if(chars[i] == alphabet[j].charAt(0))
                    countUpper++;
            }
        }
        
        System.out.println(countUpper + 1);
        
    }

}