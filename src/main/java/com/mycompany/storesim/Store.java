/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.storesim;

/**
 *
 * @author Jhoenica C. Gellido
 */
import java.util.ArrayList;
public class Store {
    private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList<>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
     if(index < itemList.size() && index>=0 ) {
         Item soldItem = itemList.get(index);
         earnings += soldItem.getCost();
         System.out.println("Item sold: " + soldItem.getName());
     }
     else {
         System.out.println("There are only " + this.itemList.size() + " items in this store.");
     }
  }
  public void sellItem(String name){
    boolean itemFound = false;
    for(Item i : itemList) {
        if (i.getName().equals(name)) {
            earnings += i.getCost();
            System.out.println("Item sold " + i.getName() + "for $" + i.getCost());
            itemFound = true;
    }
        if(!itemFound){
            System.out.println(this.getName() + " does not sell the item " + name);
        }
    }
  }
  public void sellItem(Item i){
    boolean foundItem = false;
    if(itemList.contains(i)){
        earnings += i.getCost();
        System.out.println("Item sold: " + i.getName() + " for " + i.getCost());
        foundItem = true;
    }
        if(!foundItem) {
            System.out.println(this.getName() + " does not have item " + i.getName());
        }
    
  }
  public void addItem(Item i){
    this.itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.println("Items with matching type: ");
    for(Item i: itemList) {
        if(i.getType().equals(type)) {
        System.out.println(i.getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    System.out.println("Items with lower cost than " + maxCost + ":");
    for(Item i: itemList) {
        if (i.getCost() <= maxCost) {
            System.out.println(i.getName() + ": $" + i.getCost());
        }
    }
  }
  public void filterExpensive(double minCost){
    System.out.println("Items with higher cost than " + minCost + ":");
    for(Item i: itemList) {
        if (i.getCost() >= minCost) {
            System.out.println(i.getName() + ": $" + i.getCost());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    System.out.println("Store statistics");
    for(Store s: storeList) {
        if(storeList.contains(s)){
            System.out.println(s.getName() + " has $" + s.getEarnings() + " in earnings.");
        }
    }
  }
}
