package org.example.AbsractNouns;

import org.example.Interior.Interior;
import org.example.Participles;

public class Loud extends AbstractNouns {

    public Loud(){
        this.state = "шум";
    }
    @Override
    public void volume() {
        System.out.print(state + " нарастал");
    }

    public void volume(Participles p, Interior i){
        System.out.print(state + p+ i.creative().toLowerCase()+" нарастал");
    }
}
