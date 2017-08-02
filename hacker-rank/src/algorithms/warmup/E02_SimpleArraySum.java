package algorithms.warmup;
import java.util.Scanner;

public class E02_SimpleArraySum {

    //https://www.hackerrank.com/challenges/simple-array-sum
    
    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a + b;
    }


    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
