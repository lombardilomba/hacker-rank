package algorithms.machine.learning;

import java.util.Scanner;

public class E01_BotSavePrincess {
    
    //https://www.hackerrank.com/challenges/saveprincess

    static void displayPathtoPrincess(int n, String[] grid) {
        int linePrincessIdx = 0;
        int columnPrincessIdx = 0;
        
        int lineBotIdx = 0;
        int columnBotIdx = 0;
        
        for(int i = 0; i < grid.length; i++) {
            
            if(grid[i].contains("p")) {
                linePrincessIdx = i;
                char[] paths = grid[i].toCharArray();
                for(int j = 0; j < paths.length; j++) {
                    if(paths[j] == 'p')
                        columnPrincessIdx = j;
                }
            }
            
            if(grid[i].contains("m")) {
                lineBotIdx = i;
                char[] paths = grid[i].toCharArray();
                for(int j = 0; j < paths.length; j++) {
                    if(paths[j] == 'm')
                        columnBotIdx = j;
                }                
            }
        }
        
        int vDistance = (linePrincessIdx - lineBotIdx) < 0 ? (linePrincessIdx - lineBotIdx) * (-1) : (linePrincessIdx - lineBotIdx);
        
        while(vDistance != 0) {
            if(linePrincessIdx > lineBotIdx)
                System.out.println("DOWN");
            else
                System.out.println("UP");
            vDistance--;
        }
        
        int hDistance = (columnPrincessIdx - columnBotIdx) < 0 ? (columnPrincessIdx - columnBotIdx) * (-1) : (columnPrincessIdx - columnBotIdx);
        
        while(hDistance != 0) {
            if(columnPrincessIdx > columnBotIdx)
                System.out.println("RIGHT");
            else
                System.out.println("LEFT");
            hDistance--;
        }
        
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        
        String grid[] = new String[m];
        for (int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

        displayPathtoPrincess(m, grid);
    }
    
}