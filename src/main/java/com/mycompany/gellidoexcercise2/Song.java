/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gellidoexcercise2;

/**
 *
 * @author Jhoenica C. Gellido
 */
public class Song {
    private String title;
    private String artist;
    
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public Song(String title) {
        this.title = title;
        this.artist = "Unknown";
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }
}
