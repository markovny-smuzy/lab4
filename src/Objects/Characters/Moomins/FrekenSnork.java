package Objects.Characters.Moomins;

import Enums.Action;
import Objects.Characters.Characters;

public class FrekenSnork extends Characters {
    String name;
    public FrekenSnork(String name) {
        super(name);
        this.name = name;
    }

    public void actPlace(Action a) {
        System.out.print(this.name + " " + a.getAct() + " " + getLocation() + ".\n");
    }
}
