/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gellidoexcercise2;

/**
 *
 * @author Jhoenica C. Gellido
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private Management handler;
    private Singer partner;
    private static int totalPerformances = 0;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong, Management handler) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
        this.handler = handler;
    }
    
    
    public void performForAudience(int audience){
        this.noOfPerformances += 1;
        this.earnings += audience*100;
        double cut = audience*100*this.getHandler().getPercentage();
        this.earnings-=cut;
        this.getHandler().setRevenue(this.getHandler().getRevenue() + cut);
        this.getHandler().setConcertsdone(this.getHandler().getConcertsdone() + 1);
        System.out.println(this.getName() + " performed for an audience of " + audience);
        totalPerformances += 1;
        
    }
    
    public void performForAudience(int audience, Singer partner) {
        this.partner = partner;
        this.noOfPerformances += 1;
        this.partner.noOfPerformances += 1;
        this.earnings += (audience/2)*100;
        this.partner.earnings += (audience/2)*100;
        double cut = (audience/2)*100*this.getHandler().getPercentage();
        double othercut = (audience/2)*100*this.partner.getHandler().getPercentage();
        this.earnings-=cut;
        this.partner.earnings-=othercut;
        this.getHandler().setRevenue(this.getHandler().getRevenue() + cut);
        this.partner.getHandler().setRevenue(this.partner.getHandler().getRevenue() + othercut);
        this.getHandler().setConcertsdone(this.getHandler().getConcertsdone() + 1);
        this.partner.getHandler().setConcertsdone(this.partner.getHandler().getConcertsdone() + 1);
        System.out.println("Together, " + this.getName() + " and " + this.partner.getName() + " performed for an audience of " + audience);
        totalPerformances +=1;
    }
    
    public void changeFaveSong(Song newFavoriteSong) {
        this.favoriteSong = newFavoriteSong;
    }
    public void changemanager(Management newhandler){
        this.handler = newhandler;
    }
    
    public void introduce() {
        System.out.println("Hi! My name is " + this.getName() + " and I am managed by " + this.getHandler().getName());
    }

    /**
     * @return the noOfPerformances
     */
    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    /**
     * @return the earnings
     */
    public double getEarnings() {
        return earnings;
    }

    /**
     * @return the favoriteSong
     */
    public Song getFavoriteSong() {
        return favoriteSong;
    }

    /**
     * @return the partner
     */
    public Singer getPartner() {
        return partner;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the handler
     */
    public Management getHandler() {
        return handler;
    }

    /**
     * @return the totalPerformances
     */
    public static int getTotalPerformances() {
        return totalPerformances;
    }
}
