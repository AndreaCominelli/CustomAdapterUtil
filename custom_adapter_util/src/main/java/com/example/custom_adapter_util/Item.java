package com.example.custom_adapter_util;

import java.util.ArrayList;

public class Item {

    //this specifies all the components of my item (ImageView, TextView, EdiText...)
    private ArrayList<Object> components;

    public Item(ArrayList<Object> components){
        this.components = components;
    }

    public ArrayList<Object> getComponents() {
        return components;
    }

}
