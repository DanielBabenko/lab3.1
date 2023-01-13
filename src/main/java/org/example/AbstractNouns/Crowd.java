package org.example.AbstractNouns;

import org.example.Interior.Interior;
import org.example.Participles;

public class Crowd extends AbstractNouns {
    public Crowd(){
        this.state = "Толпа";
    }

    @Override
    public void volume() {
        System.out.print(state + " притаилась");
    }

    public void volume(Participles p, Interior i){
        System.out.print(state + " притаилась" + p + i.creative().toLowerCase());
    }
}
