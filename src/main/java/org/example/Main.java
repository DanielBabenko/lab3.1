package org.example;

import org.example.AbsractNouns.Crowd;
import org.example.AbsractNouns.Loud;
import org.example.AbsractNouns.Quiet;
import org.example.Characters.Dunno;
import org.example.Characters.Kozlik;
import org.example.Interior.Chest;
import org.example.Interior.Door;
import org.example.Interior.Tube;
import org.example.Interior.Window;
import org.example.Things.Rope;

public class Main {
    private static void endQuote(){
        System.out.print(". "+'\n');
    }

    private static void comma(){
        System.out.print(",");
    }

    private static void link(int i){
        LinkingWords links[] = LinkingWords.values();
        System.out.print(links[i]);
    }

    private static void participles(Participles p){
        System.out.print(p);
    }

    public static void main(String[] args) {
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

        participles(Participles.THOUGHTLESS);
        kozlik.run(w);
        link(0);
        kozlik.open(w);
        endQuote();

        participles(Participles.LOOKDOWN);
        link(0);
        participles(Participles.ENSURED);
        participles(Participles.JUMPDOWN);
        kozlik.take(chest,rope.ropePart(Rope.RopeParts.CUTS));
        link(0);
        kozlik.bind(rope.ropePart(Rope.RopeParts.CUTS));
        endQuote();

        dunno.assist(kozlik);
        endQuote();

        participles(Participles.MEANWHILE);
        loud.volume(Participles.BEHIND,door);
        endQuote();

        door.shake(Participles.BEATEN);
        link(2);
        door.resist();
        endQuote();

        participles(Participles.UNEXPECTED);
        quiet.volume();
        endQuote();

        crowd.volume(Participles.BEHIND,door);
        endQuote();

        participles(Participles.LEANED);
        kozlik.descent(rope.ropePart(Rope.RopeParts.END),Participles.BACKYARD);
        link(0);
        comma();
        participles(Participles.ENSURED);
        rope.descent(rope.ropePart(Rope.RopeParts.END),Participles.GROUND);
        comma();
        kozlik.tie(rope.ropePart(Rope.RopeParts.OTHER),tube);
        tube.getAdj();
        endQuote();
    }
}