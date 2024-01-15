package Objects.Characters.Moomins;

import Enums.Action;
import Objects.Characters.Characters;
import Objects.Place;

public class MoomiMom extends Characters {
    public MoomiMom(String name) {
        super(name);
        this.name = name;
    }
    public void act(Action a, Place p) {
        System.out.print(this.name + " " + a.getAct() + " " + p.getName());
    }
}
