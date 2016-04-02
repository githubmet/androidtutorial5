package com.example.donottouch6.myapplication.model;


import java.util.ArrayList;

public class P021ParentStrong {

    String parentNames;
    ArrayList<P021ChildStrong> childItems;

    public String getParentNames() {
        return parentNames;
    }

    public void setParentNames(String parentNames) {
        this.parentNames = parentNames;
    }

    public ArrayList<P021ChildStrong> getChildItems() {
        return childItems;
    }

    public void setChildItems(ArrayList<P021ChildStrong> childItems) {
        this.childItems = childItems;
    }
}
