package project1;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.System;
import java.lang.String;

/**
 * @author Mohammad Khan
 * 
 * This program serves at the 1st project in my CSC 202 class.
 * It's function is to take in a number of Soccer Games and output
 * the teams and their scores.
 */
public interface SoccerGames {
   /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates an object from the Scanner class.
        
        // Asks the user to enter a number of games to be played and
        // scans the input.
        System.out.print("Number of Games: ");
        int numOfGames = scan.nextInt();
        
        System.out.println("");
        
        // Creates a 3D array that stores both the team names and their scores.
        String[][][] games = new String[numOfGames][2][2];
        games[0][0][0] = "UR"; 
        games[0][0][1] = "0"; 
        games[0][1][0] = "VCU";
        games[0][1][1] = "1"; 
        games[1][0][0] = "JTCC"; 
        games[1][0][1] = "2"; 
        games[1][1][0] = "JSRCC";
        games[1][1][1] = "3"; 
        
        // Nested for loop that runs through all array elements. 
        for (int i = 0; i < numOfGames; i++) {
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 2; k++) {
                    // Prints out both team names and their corresponding scores.
                    System.out.println("Game " + (i + 1) + ", Team 1: Name: " + games[i][j][k]);
                    System.out.println("Game " + (i + 1) + ", Team 1: Score: " + games[i][j][k+1]);
                    System.out.println("Game " + (i + 1) + ", Team 2: Name: " + games[i][j+1][k]);
                    System.out.println("Game " + (i + 1) + ", Team 2: Score: " + games[i][j+1][k+1]);
                    
                    // increases the row and column values in the array in order to print the 
                    // names and scores of the teams in the next game when the nested for loop repeats.
                    j++;
                    k++;
                }
            }
            
        }
        // Prints out the summary of teams, their scores, and which game they were in.
        System.out.println("");
        System.out.println("Games 1: " + games[0][0][0] + " " + games[0][0][1] + " " + games[0][1][0] + " " + games[0][1][1]);
        System.out.println("Games 2: " + games[1][0][0] + " " + games[1][0][1] + " " + games[1][1][0] + " " + games[1][1][1]);
    }
}