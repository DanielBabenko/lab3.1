package org.example.Interior;

import org.example.Decline;

public class Tube extends Interior {
    private String adj;
    public Tube() {
        this.name = "труба";
        this.decline = Decline.FIRST;
    }

    public Tube(String adj) {
        this.name = "труба";
        this.decline = Decline.FIRST;
        this.adj = adj;
    }

    public void getAdj() {
        System.out.print(" "+adj);
    }
}
