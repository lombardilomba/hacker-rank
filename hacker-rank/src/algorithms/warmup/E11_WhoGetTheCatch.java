package algorithms.warmup;

import java.util.Scanner;

public class E11_WhoGetTheCatch {

    //XXX - NÃO ESTÁ 100%
    // https://www.hackerrank.com/contests/hourrank-21/challenges/who-gets-the-catch

    static int whoGetsTheCatch(int n, int x, int[] X, int[] V){
        int[] results = new int[X.length];
        int result = 0;
        
        for(int i = 0; i < X.length; i++) {
            int distance = X[i] > x ? X[i] - x : x - X[i];
            int velocity = V[i];
            results[i] = distance / velocity;
        }
        
        int lower = Integer.MAX_VALUE;
        for(int i = 0; i < results.length; i++) {
            if( results[i] == lower )
                result = -1;
            else if(results[i] < lower) {
                lower = results[i];
                result = i; 
            }
        }
        
        return result;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the index of the catcher who gets the catch, or -1 if no one gets the catch.
        int n = in.nextInt();
        int x = in.nextInt();
        int[] X = new int[n];
        for(int X_i=0; X_i < n; X_i++){
            X[X_i] = in.nextInt();
        }
        int[] V = new int[n];
        for(int V_i=0; V_i < n; V_i++){
            V[V_i] = in.nextInt();
        }
        int result = whoGetsTheCatch(n, x, X, V);
        System.out.println(result);
        
    }

}