package Objects.Things;

import Enums.Action;
import Interfaces.Gettable;
import Objects.Obj;
import Objects.Place;

public class ShellsAndSnails extends Obj implements Gettable {
    String name;
    public ShellsAndSnails(String name) {
        super(name);
        this.name = name;
    }

    public void be(Action a, Place p) {
        System.out.print(p.getName() + " " + a.getAct() + " " + this.name);
    }
}
