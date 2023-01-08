package org.example.Characters;

import org.example.Decline;

public class Dunno extends Shorty implements Assistable {
    public Dunno(){
        this.name = "Незнайка";
        this.decline = Decline.FIRST;
    }

    @Override
    public void assist(Object person) {
        System.out.print(name +" принялся помогать " + person);
    }
}