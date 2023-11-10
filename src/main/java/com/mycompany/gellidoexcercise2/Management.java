/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gellidoexcercise2;

/**
 *
 * @author Jhoenica C. Gellido
 */
public class Management {
    private String name;
    private double percentage;
    private double revenue;
    private int concertsdone;
    
    public Management(String name,double percentage, double revenue, int concertsdone) {
        this.name = name;
        this.percentage = percentage;
        this.revenue = revenue;
        this.concertsdone = concertsdone;
    }

    /**
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * @return the revenue
     */
    public double getRevenue() {
        return revenue;
    }

    /**
     * @return the concertsdone
     */
    public int getConcertsdone() {
        return concertsdone;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    /**
     * @param revenue the revenue to set
     */
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    /**
     * @param concertsdone the concertsdone to set
     */
    public void setConcertsdone(int concertsdone) {
        this.concertsdone = concertsdone;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
