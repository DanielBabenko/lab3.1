package org.example.Characters;

import org.example.Interior.Interior;
import org.example.Noun;
import org.example.Things.Thing;

public interface Takeable {
    void take(Interior box, Object thing);
}
