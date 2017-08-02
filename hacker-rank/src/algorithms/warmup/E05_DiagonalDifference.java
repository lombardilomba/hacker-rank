package algorithms.warmup;
import java.util.Scanner;

public class E05_DiagonalDifference {

    //https://www.hackerrank.com/challenges/diagonal-difference

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        long diagonal0 = 0;
        long diagonal1 = 0;
        int indiceDiagonal0 = 0;
        int indiceDiagonal1 = n - 1;
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++) {
                if(a_i == indiceDiagonal0 && a_j == indiceDiagonal0) {
                    diagonal0 += a[a_i][a_j];
                }
                if(a_i == indiceDiagonal0 && a_j == indiceDiagonal1) {
                    diagonal1 += a[a_i][a_j];
                }
            }
            indiceDiagonal0++;
            indiceDiagonal1--;
        }
        
        long finalResult = (diagonal0 - diagonal1) < 0 ? (diagonal0 - diagonal1) * (-1) : (diagonal0 - diagonal1);
        System.out.println(finalResult);
        
    }
    
}