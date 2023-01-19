package org.example;

import org.example.AbstractNouns.Crowd;
import org.example.AbstractNouns.Loud;
import org.example.AbstractNouns.Quiet;
import org.example.Characters.Dunno;
import org.example.Characters.Kozlik;
import org.example.Exceptions.OutOfScenarioException;
import org.example.Interior.*;
import org.example.Places.OfficeBuilding;
import org.example.Things.Rope;

public class Main {

    private static void endQuote(){
        System.out.print(". "+'\n');
    }

    private static void comma(){
        System.out.print(",");
    }

    private static void link(int i){
        LinkingWords[] links = LinkingWords.values();
        System.out.print(links[i]);
    }

    private static void participles(Participles p){
        System.out.print(p);
    }

    public static void main(String[] args) {

        OfficeBuilding office = new OfficeBuilding();
        OfficeBuilding hall = new OfficeBuilding(){};
        hall.rename("коридор");
        OfficeBuilding o = new OfficeBuilding(){
            private void changeDecline(){
                this.decline = Decline.FIRST;
            }
        };
        o.rename("контора");
        OfficeBuilding exit = new OfficeBuilding(){};
        exit.rename("выход");
        exit.setAdj("из конторы");


        Kozlik kozlik = new Kozlik();
        Dunno dunno = new Dunno();
        Window w = new Window();
        Chest chest = new Chest();
        Rope rope = new Rope();
        Loud loud = new Loud();
        Quiet quiet = new Quiet();
        Door door = new Door();
        Crowd crowd = new Crowd();
        Tube tube = new Tube("парового отопления");
        Crowd.Stockholders stockholders = crowd.new Stockholders("акционеры");
        Crowd.Owners owners = new Crowd.Owners();

        kozlik.jump(exit);
        exit.getAdj();
        link(0);
        kozlik.lock(door);
        participles(Participles.INTIME);
        participles(Participles.CAUSE);
        loud.tapVolume();
        endQuote();

        stockholders.breakThrough(office);
        link(0);
        stockholders.run(hall);
        endQuote();

        participles(Participles.REACH);
        owners.knock(door);
        link(0);
        owners.volume();
        //owners.goAway();
        endQuote();

        try {
            kozlik.makePlan(owners);
        } catch (OutOfScenarioException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        participles(Participles.THOUGHTLESS);
        kozlik.run(w);
        link(0);
        kozlik.open(w);
        endQuote();

        participles(Participles.LOOKDOWN);
        link(0);
        participles(Participles.ENSURED);
        participles(Participles.JUMPDOWN);
        kozlik.take(chest, rope.ropePart(Rope.RopeParts.CUTS));
        link(0);
        kozlik.bind(rope.ropePart(Rope.RopeParts.CUTS));
        endQuote();

        dunno.assist(kozlik);
        endQuote();

        participles(Participles.MEANWHILE);
        loud.volume(Participles.BEHIND, door);
        endQuote();

        door.shake(Participles.BEATEN);
        link(2);
        door.resist();
        endQuote();

        participles(Participles.UNEXPECTED);
        quiet.volume();
        endQuote();

        crowd.volume(Participles.BEHIND, door);
        endQuote();

        participles(Participles.LEANED);
        kozlik.descent(rope.ropePart(Rope.RopeParts.END), Participles.BACKYARD);
        link(0);
        comma();
        participles(Participles.ENSURED);
        rope.descent(rope.ropePart(Rope.RopeParts.END), Participles.GROUND);
        comma();
        kozlik.tie(rope.ropePart(Rope.RopeParts.OTHER), tube);
        tube.getAdj();
        endQuote();
    }
}