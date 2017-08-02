package algorithms.warmup;

import java.util.Scanner;

public class E10_CatsAndMouse {

    // https://www.hackerrank.com/challenges/cats-and-a-mouse

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();       // Cat A
            int y = in.nextInt();       // Cat B
            int z = in.nextInt();       // Mouse C
            
            if(Math.abs(x - z) > Math.abs(y - z))
                System.out.println("Cat B");
            else if (Math.abs(x - z) < Math.abs(y - z))
                System.out.println("Cat A");
            else
                System.out.println("Mouse C");
        }
    }

}