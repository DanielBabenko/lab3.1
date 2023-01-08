package org.example.AbsractNouns;

public class Quiet extends AbstractNouns {

    public Quiet(){
        this.state = "тишина";
    }
    @Override
    public void volume() {
        System.out.print(" наступила "+ state);
    }
}
