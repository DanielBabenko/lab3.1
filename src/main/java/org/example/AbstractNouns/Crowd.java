package org.example.AbstractNouns;

import org.example.Characters.Runnable;
import org.example.Interior.Interior;
import org.example.Participles;
import org.example.Places.OfficeBuilding;
import org.example.Places.Place;

public class Crowd extends AbstractNouns implements Runnable,BreakTrough{

    String members;
    public Crowd(){
        this.state = "Толпа";
    }

    public Crowd(String members){
        this.members = members;
        this.state = "Толпа"+ " " + removeLastChar(members) + "ов";
    }

    @Override
    public void volume() {
        System.out.print(state + " притаилась");
    }

    public void volume(Participles p, Interior i){
        System.out.print(state + " притаилась" + p + i.creative().toLowerCase());
    }

    @Override
    public void run(Interior i) {
        System.out.print(state + " бежала");
    }
    Crowd stockholders = new Crowd("акционеры"){
        public void run(Participles p, OfficeBuilding place) {
            System.out.print(" бежала" + p + place.dative());
        }

        public void breakThrough(Place place) {
            System.out.print(state + " прорвалась в " + place);
        }
    };

    public void run(Participles p, OfficeBuilding place) {
        stockholders.run(p,place);
    }

    @Override
    public void breakThrough(Place place) {
        stockholders.breakThrough(place);
    }
}


