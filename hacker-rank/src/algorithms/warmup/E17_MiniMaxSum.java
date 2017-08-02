package algorithms.warmup;

import java.util.Scanner;

public class E17_MiniMaxSum {
    
    // https://www.hackerrank.com/challenges/mini-max-sum

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long[] arr = new Long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        
        Long minSum = 0L;
        Long maxSum = 0L;
        
        for(int i = 0 ; i < arr.length; i++) {
            Long actualSum = 0L;
            
            for(int j = 0; j < arr.length; j++) {
                Long numberB = arr[j];
                
                if(i != j) {
                    actualSum = actualSum + numberB;
                }
            }
            
            if(minSum.equals(0L) || actualSum <= minSum)
                minSum = actualSum;
            
            if(actualSum >= maxSum)
                maxSum = actualSum;
        }
        
        System.out.println(minSum + " " + maxSum);
        
    }
    
}