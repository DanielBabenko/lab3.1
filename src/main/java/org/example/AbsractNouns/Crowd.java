package org.example.AbsractNouns;

import org.example.Participles;

public class Crowd extends AbstractNouns {
    public Crowd(){
        this.state = "Толпа";
    }

    @Override
    public void volume() {
        System.out.print(state + " притаилась");
    }

    public void volume(Participles p, Object o){
        System.out.print(state + " притаилась" + p + o.toString().toLowerCase());
    }
}
