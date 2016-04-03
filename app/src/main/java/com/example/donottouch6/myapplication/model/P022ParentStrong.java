package com.example.donottouch6.myapplication.model;

import java.util.ArrayList;

public class P022ParentStrong {

    String parentName;
    ArrayList<P022ChildStrong> p022ChildStrongArrayList;

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public ArrayList<P022ChildStrong> getP022ChildStrongArrayList() {
        return p022ChildStrongArrayList;
    }

    public void setP022ChildStrongArrayList(ArrayList<P022ChildStrong> p022ChildStrongArrayList) {
        this.p022ChildStrongArrayList = p022ChildStrongArrayList;
    }
}
