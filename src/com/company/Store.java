package com.company;

import java.util.ArrayList;

public class Store {
    private ArrayList<Image> inventory;

    public Store(){

    }

    public void populateInventory(){
        //sets up a mock inventory
    }

    public void discount(int imageID, int discount){
        //dollar amount discount
    }

    public void discount(int imageID, float percent){
        //percentage discount
    }

    public int makeChange(double total, double received) {
        //make change based on
        return -1;
    }
}
