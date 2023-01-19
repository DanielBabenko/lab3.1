package org.example.AbstractNouns;

import org.example.Characters.Runnable;
import org.example.Interior.Interior;
import org.example.Participles;
import org.example.Places.Place;

public class Crowd extends AbstractNouns implements Runnable,BreakThrough{

    String members;
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

    @Override
    public void run(Interior i) {
        System.out.print(" бежала за "+i.creative());
    }

    @Override
    public void breakThrough(Place place) {}

    public class Stockholders {
        public Stockholders(String members){
            Crowd.this.members = members;
            Crowd.this.state = "Толпа"+ " " + removeLastChar(members) + "ов";
        }
        public void breakThrough(Place place) {
            System.out.print(state+" прорвалась в "+place);
        }

        public void run(Place place) {
            System.out.print(" бежала по "+place.dative());
        }

    }

    public static class Owners implements Knockable,VolumeChange{
        private static String status;
        private boolean knocking;
        private boolean shouting;
        public Owners(){
            status = "владельцы гигантских акций";
        }

        @Override
        public String toString() {
            return status;
        }

        @Override
        public void knock(Interior i) {
            System.out.print(status+ " принялись стучать кулаками в дверь");
            knocking = true;
        }

        @Override
        public void volume() {
            System.out.print(" стали кричать");
            shouting = true;
        }

        public void goAway(){
            System.out.print(" ... и ушли");
            shouting = false;
            knocking = false;
        }

        public boolean areKnocking() {
            return knocking;
        }

        public boolean areShouting() {
            return shouting;
        }
    }
}


