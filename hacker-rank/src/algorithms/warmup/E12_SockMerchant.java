package algorithms.warmup;

import java.util.Scanner;

public class E12_SockMerchant {

    // https://www.hackerrank.com/challenges/sock-merchant
    
    static int sockMerchant(int n, int[] ar) {
        
        int[] distincts = new int[ar.length];
        int[] counts = new int[ar.length];
        int lastIndex = 0;

        for(int i = 0; i < ar.length; i++) {
            int index = findInArray(ar[i], distincts); 
            if(index == -1) {
                distincts[lastIndex] = ar[i];
                counts[lastIndex] = counts[lastIndex] + 1; 
                lastIndex++;
            } else {
                counts[index] = counts[index] + 1;
            }
        }
        
        int pairs = 0;
        
        for(int i = 0; i < counts.length; i++) {
            pairs += counts[i] / 2;
        }
        
        return pairs;
    }
    
    static int findInArray(int value, int[] ar) {
        int result = -1;
        for(int i = 0; i < ar.length; i++) {
            if(value == ar[i]) {
                result = i;
                break;
            }
        }
        return result;
    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}