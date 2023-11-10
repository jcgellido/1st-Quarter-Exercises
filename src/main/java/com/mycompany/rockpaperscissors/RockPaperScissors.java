/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rockpaperscissors;

/**
 *
 * @author Jhoenica C. Gellido
 */
import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args) {
        int playerScore = 0;
        int computerScore = 0;
        boolean continueGame = true;
        Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
        System.out.println("1. Start game");
        System.out.println("2. Change number of rounds");
        System.out.println("3. Exit application");

        do {
            int choice = sc.nextInt();
                if(choice==1) {
                System.out.println("This match will be first to " + roundsToWin);
                while (computerScore < roundsToWin && playerScore < roundsToWin){
                    System.out.println("The computer has selected its move. Select yours: ");
                    System.out.println("1. " + rock.getName());
                    System.out.println("2. " + paper.getName());
                    System.out.println("3. " + scissors.getName());
                    int playerMove = sc.nextInt();
                    int computerMove = (int) Math.floor(Math.random()*3) + 1;
                    Move playerchoice = null;
                    Move computerchoice = null;
                    
                    if (playerMove == 1) {
                        playerchoice = rock;
                    }
                    else if (playerMove == 2) {
                        playerchoice = paper;
                    }
                    else if (playerMove == 3) {
                        playerchoice = scissors;
                    }
                    if (computerMove == 1) {
                        computerchoice = rock;
                    }
                    else if (computerMove == 2) {
                        computerchoice = paper;
                    }
                    else if (computerMove == 3) {
                        computerchoice = scissors;
                    }
                    
                    int roundresult = Move.compareMoves(playerchoice, computerchoice);
                    String verdict = null;
                    switch (roundresult) {
                        case 0:
                            verdict = "Player wins round";
                            playerScore++;
                            break;
                        case 1:
                            verdict = "Computer wins round";
                            computerScore++;
                            break;
                        case 2:
                            verdict = "It's a tie";
                            break;
                    }
                    System.out.println("Player chose " + playerchoice.getName() + ". Computer chose " + computerchoice.getName()+ verdict);
                    
                    
                    System.out.println("Player: " + playerScore + " Computer: " + computerScore);
                }
                String winner = playerScore > computerScore ? "Player wins" : "Computer Wins";
                System.out.println(winner);
                computerScore = 0;
                playerScore = 0;
                continueGame = true;
                System.out.println("Would you like to play again? Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit application");
                }
            
                else if(choice==2) {  
                System.out.println("How many wins are needed to win a match?");
                roundsToWin = sc.nextInt();
                System.out.println("New setting has been saved");
                continueGame = true;
                System.out.println("Please choose an option:");
                System.out.println("1. Start game");
                System.out.println("2. Change number of rounds");
                System.out.println("3. Exit application"); /*I tried but I wasn't able to find a way to loop this so that I wouldn't have to print the menu again :((*/
                }
            
                else if(choice==3) {
                System.out.println("Thank you for playing!");
                continueGame = false;
                }
            
                else {
                System.out.println("Sorry, your input is invalid. Choose another option[1, 2, 3]");
                }
        } while(continueGame);
    }
}
