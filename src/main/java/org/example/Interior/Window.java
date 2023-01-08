package org.example.Interior;

import org.example.Decline;

public class Window extends Interior{
    public Window(){
        super.name = "окно";
        super.decline = Decline.SECOND;
    }

    @Override
    public String dative() {
        String n = this.name;
        String n1 = removeLastChar(n);
        int i = this.decline.ordinal();
        switch (i) {
            case 0: n = n1+"е";break;
            case 1: n = n1 +"у";break;
            case 2: n = n1+"и";break;
        }
        return n;
    }
}

