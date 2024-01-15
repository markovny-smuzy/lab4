package Objects;

import Enums.*;
import Interfaces.*;

//Класс действующих и одушевленных объектов(не люди и не живые существа)

public class Acting extends Obj implements Active, Attribute, Gettable {
    private final String name;
    public Acting(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void act(Action a) {
        System.out.print(this.name + " " + a.getAct());
    }

    public void actPlace(Action a, Place p) {
        System.out.print(this.name + " " + a.getAct() + " " + p.getName());
    }

    public void actAdv(Action a, Adverb ad) {
        System.out.print(this.name + " " + a.getAct() + " " + ad.getAdv());
    }

    public void doubleAct(Action a1, Action a2) {
        System.out.print(this.name + " " + a1.getAct() + " " + a2.getAct());
    }

    public void ActShoulders(Action a) {
        System.out.print(this.name + " " + a.getAct() + " с плеч");
    }

    @Override
    public void sig(Sign s) {
        System.out.print(s.getSig() + " " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}

