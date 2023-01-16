package org.example.Characters;

import org.example.AbstractNouns.Crowd;
import org.example.Decline;
import org.example.Exceptions.OutOfScenarioException;
import org.example.Interior.Interior;

public class Kozlik extends Shorty implements Lockable {
    public Kozlik(){
        this.name = "Козлик";
        this.decline = Decline.SECOND;
    }

    @Override
    public void lock(Interior i) {
        System.out.print(" запер "+i.toString().toLowerCase()+" на ключ");
    }

    public void makePlan(Crowd.Owners owners) throws OutOfScenarioException{
        if (owners.areKnocking()& owners.areShouting()){
            System.out.print("Созрел план: ");
        } else {
            throw new OutOfScenarioException("\n Всё идёт не по сценарию! Ещё один дубль!");
        }
    }
}
