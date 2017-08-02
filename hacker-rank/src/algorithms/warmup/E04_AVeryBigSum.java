package algorithms.warmup;
import java.util.Scanner;

public class E04_AVeryBigSum {

    //https://www.hackerrank.com/challenges/a-very-big-sum
    
    static long aVeryBigSum(int n, long[] ar) {
        long result = 0;
        for(long number : ar)
            result += number;
        return result;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
    
}