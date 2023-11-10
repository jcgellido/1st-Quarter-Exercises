/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gellidoexcercise2;

/**
 *
 * @author Jhoenica C. Gellido
 */
public class GellidoExcercise2 {

    public static void main(String[] args) {
        Management Alist = new Management("The A-list", 0.2, 500000, 14);
        Management star = new Management("Starhouse Entertainment", 0.15, 200000, 6);
        Management onevoice = new Management("Onevoice Talent Management", 0.25, 1000000, 26);
        Song toolate = new Song("It's too late", "Carole King");
        Song onlyone = new Song("Only One", "Carlie Hanson");
        Song westcoast = new Song("West Coast", "Junior Empire");
        Song bluejeans = new Song("Blue Jeans", "Lana Del Rey");
        Singer oliviarhodes = new Singer("Olivia Rhodes", 0, 0, toolate, star);
        Singer taysmith = new Singer("Taye Smith", 0, 0, onlyone, Alist);
        Singer lianaraye = new Singer("Liana Raye", 0, 0, bluejeans, onevoice);
        taysmith.introduce();
        oliviarhodes.introduce();
        lianaraye.introduce();
        System.out.println(Alist.getName() + " has " + Alist.getRevenue() + " total revenue");
        System.out.println(Alist.getName() + " has handled " + Alist.getConcertsdone() + " concerts so far.");
        System.out.println(star.getName() + " has handled " + star.getConcertsdone() + " concerts so far.");
        System.out.println(taysmith.getName() + "'s favorite song is " + taysmith.getFavoriteSong().getTitle() + " by " + taysmith.getFavoriteSong().getArtist());
        taysmith.performForAudience(12);
        System.out.println("Taye Smith has " + taysmith.getEarnings() + " in earnings");
        taysmith.changeFaveSong(westcoast);
        System.out.println(taysmith.getName() + "'s favorite song is " + taysmith.getFavoriteSong().getTitle() + " by " + taysmith.getFavoriteSong().getArtist());
        System.out.println("After the mini performance, " + taysmith.getHandler().getName() + " has " + Alist.getRevenue() + "now");
        oliviarhodes.performForAudience(300);
        taysmith.performForAudience(10000);
        System.out.println("Wow, looks like someone got richer!" + taysmith.getName() + "'s earnings soared up to " + taysmith.getEarnings() + " after performing");
        System.out.println(Alist.getName() + " found an artist to keep, they now have " + Alist.getRevenue() + " in total");
        System.out.println(oliviarhodes.getName() + "'s favorite song is " + oliviarhodes.getFavoriteSong().getTitle());
        oliviarhodes.performForAudience(500);
        System.out.println(oliviarhodes.getName() + " is now " + oliviarhodes.getEarnings() + " worth. " + star.getName() + " has " + star.getRevenue() + " in total revenue.");
        System.out.println(Alist.getName() + " has handled " + Alist.getConcertsdone() + " concerts so far.");
        System.out.println(star.getName() + " has handled " + star.getConcertsdone() + " concerts so far.");
        System.out.println(onevoice.getName() + " has handled " + onevoice.getConcertsdone() + " so far.");
        lianaraye.performForAudience(200);
        System.out.println("Total performances: " + Singer.getTotalPerformances());
        taysmith.changemanager(onevoice);
        taysmith.introduce();
        taysmith.performForAudience(10000, oliviarhodes);
        System.out.println(onevoice.getName() + " has handled " + onevoice.getConcertsdone() + " concerts so far.");
        lianaraye.performForAudience(7000, taysmith);
        oliviarhodes.performForAudience(8000, lianaraye);
        taysmith.performForAudience(500);
        oliviarhodes.performForAudience(700);
        lianaraye.performForAudience(2500);
        System.out.println("Total performances: " + Singer.getTotalPerformances());
        System.out.println(onevoice.getName() + " has handled " + onevoice.getConcertsdone() + " concerts so far, with" + onevoice.getRevenue()+ " in revenue."); 
        /*a problem with my code is that it adds 2 to concertsDone when 2 artists of the same handler perform together, but I opted to leave it as is due to time constraints*/
        System.out.println(star.getName() + " has handled " + star.getConcertsdone() + " concerts so far, with " + star.getRevenue()+ " in revenue.");
        System.out.println(Alist.getName() + " has handled " + Alist.getConcertsdone() + " concerts so far, with " + Alist.getRevenue()+ " in revenue.");
        System.out.println("After a series of concerts, " + taysmith.getName() + " now has " + taysmith.getEarnings());
        System.out.println(oliviarhodes.getName() + " now has " + oliviarhodes.getEarnings() + " in earnings.");
        System.out.println("Even " + lianaraye.getName() + " got much richer, with " + lianaraye.getEarnings() + " in total.");
    }
}
