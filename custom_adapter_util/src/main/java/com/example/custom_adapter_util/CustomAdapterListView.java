package com.example.custom_adapter_util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CustomAdapterListView extends ArrayList {

    private int resource;
    private Context context;
    private ArrayList<Item> items;

    public CustomAdapterListView(Context context, int resource, ArrayList<Item> items){
        this.resource = resource;
        this.context = context;
        this.items = items;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(context);
            v = vi.inflate(resource, null);
        }

        return v;
    }

    public void link(){
        for(int i = 0; i < this.items.size() - 1; i++){

        }
    }

}
