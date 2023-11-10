/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradedexer1;

/**
 *
 * @author Jhoenica C. Gellido
 */
public class Gradedexer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String book1title = "1984";
        String book1auth = "George Orwell";
        int book1sold = 30000000;
        int book1words = 89000;
        
        String book2title = "Les Miserables";
        String book2auth = "Victor Hugo";
        int book2sold = 20000000;
        int book2words = 545000;
        
        String book3title = "Pride and Prejudice";
        String book3auth = "Jane Austen";
        int book3sold = 20000000;
        int book3words = 122000;
        
        boolean book2longer = book2words>book3words;
        boolean diffAuths = book1auth == book2auth;
        System.out.println("Novel 1: " + book1title);
        System.out.println("Author: " + book1auth);
        System.out.println("Copies sold: " + book1sold);
        System.out.println("Word count: " + book1words);
        System.out.println();
        System.out.println("Novel 2: " + book2title);
        System.out.println("Author: " + book2auth);
        System.out.println("Copies sold: " + book2sold);
        System.out.println("Word count: " + book2words);
        System.out.println();
        System.out.println("Novel 3 : " + book3title);
        System.out.println("Author: " + book3auth);
        System.out.println("Copies sold: " + book3sold);
        System.out.println("Word count: " + book3words);
        
        /*operations*/
        System.out.println();
        System.out.println("Total number of copies sold: " + (book1sold + book2sold + book3sold));
        System.out.println("Does Les Miserables take longer to read than Pride and Prejudice? " + book2longer);
        System.out.println("Do the novels 1984 and Les Miserables have the same author? " + diffAuths);
    }
    
}
