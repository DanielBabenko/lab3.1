package org.example;

import java.util.Objects;

public abstract class Noun {
    public String name;
    public Decline decline;

    protected String removeLastChar(String s) {
        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }

    public String genitive(){
        String n = this.name;
        String n1 = removeLastChar(n);
        int i = this.decline.ordinal();
        switch (i) {
            case 0: n = n1+"ы";break;
            case 1: n = n +"а";break;
            case 2: n = n1+"и";break;
        }
        return n;
    }

    public String dative() {
        String n = this.name;
        String n1 = removeLastChar(n);
        int i = this.decline.ordinal();
        switch (i) {
            case 0: n = n1+"е";break;
            case 1: n = n +"у";break;
            case 2: n = n1+"и";break;
        }
        return n;
    }

    public String accusative() {
        String n = this.name;
        String n1 = removeLastChar(n);
        int i = this.decline.ordinal();
        switch (i) {
            case 0:
                n = n1 + "y";
                break;
            case 1:
                n = n + "a";
                break;
            case 2:
                n = n1 + "";
                break;
        }
        return n;
    }

    public String creative() {
        String n = this.name;
        String n1 = removeLastChar(n);
        int i = this.decline.ordinal();
        switch (i) {
            case 0: n = n1+"ой";break;
            case 1: n = n +"ом";break;
            case 2: n = n1+"ью";break;
        }
        return n;
    }

    public String prepositional() {
        String n = this.name;
        String n1 = removeLastChar(n);
        int i = this.decline.ordinal();
        switch (i) {
            case 0: n = n1+"е";break;
            case 1: n = n +"е";break;
            case 2: n = n1+"и";break;
        }
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Noun noun = (Noun) o;
        return Objects.equals(name, noun.name) && decline == noun.decline;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, decline);
    }

    @Override
    public String toString() {
        return name;
    }
}
