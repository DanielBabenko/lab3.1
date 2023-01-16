package org.example.Characters;

import org.example.Interior.Interior;
import org.example.Noun;
import org.example.Participles;
import org.example.Places.Place;

public class Shorty extends Noun implements Runnable, Openable, Takeable, Tieable, Bindable, Descentable, Jumpable {


    public void open(Interior i) {
        System.out.print(" распахнул " + i);
    }

    public void take(Interior box, Object thing) {
        System.out.print(name + " достал из " + box.genitive() + " " + thing);
    }

    @Override
    public void bind(Object thing) {
        System.out.print(" начал связывать " + thing + " между собой");
    }

    @Override
    public void descent(Object o, Participles p) {
        System.out.print(name+ " опустил " + o + " " +p);
    }

    @Override
    public void tie(Object rope, Interior pole) {
        System.out.print(" привязал " + rope + " к " + pole.dative());
    }

    @Override
    public void run(Interior i) {System.out.print(name + " подбежал к "+ i.dative());}

    @Override
    public void jump(Place p) {
        System.out.print(name+" подскочил к "+p.dative());
    }
}

