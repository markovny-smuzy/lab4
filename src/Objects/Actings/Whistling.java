package Objects.Actings;

import Enums.Sign;
import Objects.Acting;

public class Whistling extends Acting {
    String name;
    public Whistling(String name) {
        super(name);
        this.name = name;
    }

    public void setName(Sign s) {
        this.name = s.getSig() + " " + name;
    }

    public void cutAir() {
        System.out.print("Вдруг " + this.name + " словно хлыстом рассек воздух. \n");
    }
}
