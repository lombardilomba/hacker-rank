package algorithms.machine.learning;

import java.util.Scanner;

public class E02_BotClean {
    
    //https://www.hackerrank.com/challenges/botclean
    
    static void next_move(int posr, int posc, String[] board){
        double minDistance = Double.MAX_VALUE;
        Dirt nextMove = null;
        
        for(int i = 0; i < board.length; i++) {
            char[] elements = board[i].toCharArray();
            for(int j = 0 ; j < elements.length; j++) {
                if('d' == elements[j]) {
                    Dirt dirt = createDirt(posr, posc, i, j);
                    if(dirt.distance <= minDistance) {
                        minDistance = dirt.distance; 
                        nextMove = dirt;
                    }
                }
            }
        }
        
        if(nextMove.operation == "CLEAN")
            updateBoard(nextMove.posr, nextMove.posc, board);
        
        System.out.println(nextMove.operation);
    }
    
    static Dirt createDirt(int posr, int posc, int posrDirt, int poscDirt) {
        Dirt dirt = new Dirt();
        dirt.distance = Math.abs(posrDirt - posr) + Math.abs(poscDirt - posc); 
        dirt.posr = posrDirt;
        dirt.posc = poscDirt;
        
        if(posr == posrDirt && posc == poscDirt)
            dirt.operation = "CLEAN";
        else if(posr != posrDirt && posr > posrDirt) 
            dirt.operation = "UP";
        else if(posr != posrDirt && posr < posrDirt) 
            dirt.operation = "DOWN";
        else if(posr == posrDirt && posc > poscDirt) 
            dirt.operation = "LEFT";
        else if(posr == posrDirt && posc < poscDirt) 
            dirt.operation = "RIGHT";
        
        return dirt;
    }
    
    static void updateBoard(int posr, int posc, String[] board) {
        char[] chars = board[posr].toCharArray();
        chars[posc] = '-';
        board[posr] = String.valueOf(chars);
    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        next_move(pos[0], pos[1], board);
    }
    
}

class Dirt {
    int posr;
    int posc;
    double distance;
    String operation;
}