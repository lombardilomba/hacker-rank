package algorithms.warmup;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class E06_PlusMinus {

    //https://www.hackerrank.com/challenges/plus-minus

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
            if(arr[arr_i] > 0)
                positives++;
            else if (arr[arr_i] < 0)
                negatives++;
            else
                zeros++;
        }
        
        System.out.println(new BigDecimal(positives).divide(new BigDecimal(arr.length), MathContext.DECIMAL64).setScale(6, RoundingMode.CEILING));
        System.out.println(new BigDecimal(negatives).divide(new BigDecimal(arr.length), MathContext.DECIMAL64).setScale(6, RoundingMode.CEILING));
        System.out.println(new BigDecimal(zeros).divide(new BigDecimal(arr.length), MathContext.DECIMAL64).setScale(6, RoundingMode.CEILING));
        
    }
    
}