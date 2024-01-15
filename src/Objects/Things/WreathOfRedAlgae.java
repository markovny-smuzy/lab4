package Objects.Things;

import Enums.Action;
import Objects.Obj;
import Objects.Place;

public class WreathOfRedAlgae extends Obj {
    String name;
    public WreathOfRedAlgae(String name) {
        super(name);
        this.name = name;
    }

    public void be(Action a, Place p) {
        System.out.print(p.getName() + " " + a.getAct() + " " + this.name);
    }
}
