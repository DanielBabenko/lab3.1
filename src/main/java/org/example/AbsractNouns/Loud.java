package org.example.AbsractNouns;

import org.example.Participles;

public class Loud extends AbstractNouns {

    public Loud(){
        this.state = "шум";
    }
    @Override
    public void volume() {
        System.out.print(state + " нарастал");
    }

    public void volume(Participles p, Object o){
        System.out.print(state + p+ o.toString().toLowerCase()+" нарастал");
    }
}
