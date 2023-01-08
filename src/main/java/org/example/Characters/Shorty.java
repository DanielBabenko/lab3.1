package org.example.Characters;

import org.example.Noun;
import org.example.Participles;

public class Shorty extends Noun implements Runnable, Openable, Takeable, Tieable, Bindable, Descentable {

    @Override
    public void run(Object o) {
        System.out.print(name + " подбежал к "+ o);
    }

    public void open(Object o) {
        System.out.print(" распахнул " + o);
    }

    public void take(Object box, Object thing) {
        System.out.print(name + " достал из " + box + " " + thing);
    }

    @Override
    public void bind(Object o) {
        System.out.print(" начал связывать " + o + " между собой");
    }

    @Override
    public void descent(Object o, Participles p) {
        System.out.print(name+ " опустил " + o + " " +p);
    }

    @Override
    public void tie(Object rope, Object pole) {
        System.out.print(" привязал " + rope + " к " + pole);
    }
}

