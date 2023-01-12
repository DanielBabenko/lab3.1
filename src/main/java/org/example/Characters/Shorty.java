package org.example.Characters;

import org.example.Interior.Interior;
import org.example.Noun;
import org.example.Participles;
import org.example.Things.Thing;

public class Shorty extends Noun implements Runnable, Openable, Takeable, Tieable, Bindable, Descentable {


    public void open(Interior i) {
        System.out.print(" распахнул " + i);
    }

    public void take(Interior box, String thing) {
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
    public void tie(String rope, Interior pole) {
        System.out.print(" привязал " + rope + " к " + pole.dative());
    }

    @Override
    public void run(Interior i) {System.out.print(name + " подбежал к "+ i.dative());}
}

