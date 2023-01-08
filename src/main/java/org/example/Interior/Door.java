package org.example.Interior;

import org.example.Decline;
import org.example.Participles;

public class Door extends Interior implements Shakeable, Resistable{
    public Door(){
        this.name = "Дверь";
        this.decline = Decline.THIRD;
    }


    @Override
    public void shake() {
        System.out.print(name +" дрожала");
    }
    public void shake(Participles p) {
        System.out.print(name +p+"дрожала");
    }

    @Override
    public void resist() {
        System.out.print(" не поддавалась");
    }
}
