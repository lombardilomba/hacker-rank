package algorithms.warmup;
import java.util.Scanner;

public class E15_BirthdayCakeCandles {
    
    // https://www.hackerrank.com/challenges/birthday-cake-candles

    static int birthdayCakeCandles(int n, int[] ar) {
        int maior = 0;
        int countMaior = 0;
        
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] == maior)
                countMaior++;
            else if(ar[i] >= maior) {
                maior = ar[i];
                countMaior = 0;
                countMaior++;
            } 
        }
        return countMaior;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
    
}