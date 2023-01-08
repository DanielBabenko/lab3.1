package org.example;

public enum LinkingWords {
    AND(" и"),
    OR(" или"),
    BUT(", но");

    String name;
    LinkingWords(String name){this.name = name;}

    @Override
    public String toString(){
        return name;
    }
}
