package Objects.Characters.Moomins;

import Enums.Adverb;
import Objects.Characters.Characters;
import Objects.Place;

public class Moomin extends Characters {
    public Moomin(String name) {
        super(name);
        this.name = name;
    }

    public void went(Adverb a, Place p) {
        System.out.print(a.getAdv() + " " + this.name + " пошёл в " + p.getName() + " Снусмумрика");
    }
}
