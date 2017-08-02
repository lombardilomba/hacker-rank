package algorithms.sorting;

import java.util.Scanner;

public class E01_InsertionSort1 {
    
    // https://www.hackerrank.com/challenges/insertionsort1
    
    public static void insertIntoSorted(int[] ar) {
        
        for (int i = 1 ; (i < ar.length - 1); i++) {
            int number = ar[i];
            int j = i;
            while( j > 0 && ar[j-1] > number) {
                ar[j] = ar[j-1];
                j--;
                ar[j] = number;
            }
        }
        printArray(ar);
        
    }
    
    /* Tail starts here */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}