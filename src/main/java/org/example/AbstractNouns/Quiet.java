package org.example.AbstractNouns;

public class Quiet extends AbstractNouns {

    public Quiet(){
        this.state = "тишина";
    }
    @Override
    public void volume() {
        System.out.print(" наступила "+ state);
    }
}
