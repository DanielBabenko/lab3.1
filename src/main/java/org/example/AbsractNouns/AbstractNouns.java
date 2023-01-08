package org.example.AbsractNouns;

import org.example.Noun;

public abstract class AbstractNouns extends Noun implements VolumeChange{
    protected String state;
    @Override
    public String toString() {
        return state;
    }
}

