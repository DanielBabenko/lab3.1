package org.example.AbstractNouns;

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

    public void tapVolume(){
        class Tap implements VolumeChange{
            String state = "топот ног";
            @Override
            public void volume() {
                System.out.print(" послышался " +state);
            }
        }
        Tap tap = new Tap();
        tap.volume();
    }
}
