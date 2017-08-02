package algorithms.warmup;

import java.util.Scanner;

public class E08_DivisibleSumPairs {

    // https://www.hackerrank.com/challenges/divisible-sum-pairs
    
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int divisible = 0;
        for(int i = 0; i < ar.length; i++) {
            for(int j = 0; j < ar.length; j++) {
                if( (i < j) && ((ar[i] + ar[j]) % k == 0) ) {
                    divisible++;
                }
            }
        }
        return divisible;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

}