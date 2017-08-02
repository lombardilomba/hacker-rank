package algorithms.warmup;
import java.util.Scanner;

public class E09_TheHurdleRace {
    
    // https://www.hackerrank.com/challenges/the-hurdle-race

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();               //max_height
        int[] height = new int[n];
        
        int maior = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if (height[height_i] > maior)
                maior = height[height_i];
        }
        
        int drinks = (maior - k) < 0 ? 0 : (maior - k);
        System.out.println(drinks);
    }
    
}