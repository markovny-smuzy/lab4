package Objects.Characters.Hemuls;

import Enums.Action;
import Objects.Characters.Characters;

public class Hemul extends Characters {
    String name;
    public Hemul(String name) {
        super(name);
        this.name= name;
    }

    public void actPlace(Action a) {
        System.out.print(this.name + " " + a.getAct() + " " + getLocation() + ".\n");
    }
}
