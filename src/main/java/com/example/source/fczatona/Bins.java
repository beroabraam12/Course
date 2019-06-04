package com.example.source.fczatona;

import java.util.ArrayList;

public class Bins {

    String id, name;
    ArrayList<Branches> branches;

    public Bins() {
    }

    public Bins(String id, String name, ArrayList<Branches> branches) {
        this.id = id;
        this.name = name;
        this.branches = branches;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Branches> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branches> branches) {
        this.branches = branches;
    }
}
