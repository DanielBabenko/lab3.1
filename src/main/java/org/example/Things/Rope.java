package org.example.Things;

import org.example.Characters.Descentable;
import org.example.Participles;

public class Rope extends Thing implements Descentable {
    @Override
    public void descent(Object o, Participles p) {
        System.out.print(o + " достаёт "+p);
    }

    public enum RopeParts {
        CUTS("обрывки верёвок"),
        END("конец верёвки"),
        OTHER("другой конец");

        String part;

        private RopeParts(String part){
            this.part = part;
        }
    }

    public String ropePart(RopeParts part){
        return part.part;
    }
}
