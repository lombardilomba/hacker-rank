package algorithms.warmup;

import java.util.Scanner;

public class E14_MigratoryBirds {

    // https://www.hackerrank.com/challenges/migratory-birds
    
    static int migratoryBirds(int n, int[] ar) {
        
        int[] birds = new int[ar.length];
        int[] count = new int[ar.length];
        
        int lastIndex = 0;
        for(int i = 0; i < ar.length; i++) {
            int index = findInArray(ar[i], birds);
            if(index == -1) {
                birds[lastIndex] = ar[i];
                count[lastIndex] = count[lastIndex] + 1;
                lastIndex++;
            } else {
                count[index] = count[index] + 1;
            }
        }
        
        int highFrequency = 0;
        int birdId = 10;
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] > highFrequency) {
                highFrequency = count[i];
                birdId = birds[i];
            } else if(count[i] == highFrequency) {
                birdId = birdId < birds[i] ? birdId : birds[i];
            }
        }
        
        return birdId;
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
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }

}