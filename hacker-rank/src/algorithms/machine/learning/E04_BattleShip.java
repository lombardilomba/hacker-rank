package algorithms.machine.learning;

import java.util.Scanner;

public class E04_BattleShip {
    
    // https://www.hackerrank.com/challenges/battleship1p
    
    static boolean isBlankCell(String actualPosition, String[] notBlank) {
        boolean ret = false;
        for(int i = 0; i < notBlank.length && ret == false; i++) {
            if( notBlank[i] != null && notBlank[i].equalsIgnoreCase(actualPosition))
                ret = true;
        }
        return ret;
    }
    
    static boolean isHit(String actualPosition, String[] hits) {
        boolean ret = false;
        for(int i = 0; i < hits.length && ret == false; i++) {
            if( hits[i] != null && hits[i].equalsIgnoreCase(actualPosition))
                ret = true;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] lines = new String[n];
        
        for(int i = 0; i < n; i++) {
            lines[i] = in.next();
        }
        in.close();
        
        String[] hits = new String[18];
        int hLastIndex = 0;
        
        String[] notBlank = new String[ (n*n) - 18];
        int nLastIndex = 0;
        
        for(int i = 0; i < lines.length; i++) {
            char[] chars = lines[i].toCharArray();
            
            for(int j = 0; j < chars.length; j ++) {
                String position = i + " " + j;
                
                if(chars[j] == 'h') {
                    hits[hLastIndex++] = position;
                    notBlank[nLastIndex++] = position; 
                }
                else if(chars[j] == 'm' || chars[j] == 'd') {
                    notBlank[nLastIndex++] = position;
                }
            }
        }
        
        String move = null;
        
        //Atacar navios
        for(int i = 0; i < hits.length && move == null; i ++) {
            if(hits[i] == null)
                break;
            
            int h = Integer.parseInt(hits[i].split(" ")[0]);
            int v = Integer.parseInt(hits[i].split(" ")[1]);
            
            for (int j = 1; j < n && move == null; j++) {
                if(isHit(( h + " " + (v - j) ), hits)) {
                    
                }
                
                if (isHit(( h + " " + (v + j) ), hits)) {
                    
                }
                
                if (isHit(( (h + j) + " " + v ), hits)) {
                    
                }
                
                if (isHit(( (h - j) + " " + v ), hits)) {
                    
                }

                if(isBlankCell(( h + " " + (v - j) ), notBlank)) {
                    move = h + " " + (v - j);
                }
                
                if (isBlankCell(( h + " " + (v + j) ), notBlank)) {
                    move = h + " " + (v + j);
                }
                
                if (isBlankCell(( (h + j) + " " + v ), notBlank)) {
                    move = (h + j) + " " + v;
                }
                
                if (isBlankCell(( (h - j) + " " + v ), notBlank)) {
                    move = (h - j) + " " + v;
                }
                
            }
            
        }
       
    }
    
}
/*
Battleship is a popular 2 player game that takes place on a 10 x 10 board. Ships of various sizes are placed on the 10 x 10 board either horizontally or vertically.
The position of the ships are hidden to the user. Your task is to sink all the ships.

Ships of the following size are given to each player.

Submarine (1 x 1) - 2 units
Destroyer (2 x 1) - 2 units
Cruiser (3 x 1) - 1 unit
Battleship(4 x 1) - 1 unit
Carrier (5 x 1) - 1 unit
In this version of the game, you will be playing solo. A testcase has a configuration of ship positions and your task is to destroy all the ships using the minimum number of moves.

Input Format

The first line contains N that denotes the size of the board. N lines follow, each containing 10 characters. 
If a cell is hit, it is denoted by character h (ascii value: 104). 
If a cell is a miss it is denoted by character m (ascii value: 109). 
If all the positions of a ship are destroyed, each of its position on the board is denoted by character d (ascii value: 100). 
If a cell is not attacked by the player, it is denoted by character - (ascii value: 45).

The board is indexed according to Matrix Convention.

Constraints

N = 10

Note 
Battleships can be touching each other.

Output Format

Output the cell to be hit in your current move. The output consists of two space separated integers R and C.

Sample Input

10
----------
----------
--------m-
----------
--d-----m-
---m-m----
------m---
-m---mm-h-
--m-------
------m---
Sample Output

7 9
Resultant Board

----------
----------
--------m-
----------
--d-----m-
---m-m----
------m---
-m---mm-dd
--m-------
------m---
Here, a ship was hit at row 7 and column 9. As the ship was completely destroyed, (7,8) and (7,9) each are represented by character d.

Scoring

score = (100 - moves_made)/5
*/