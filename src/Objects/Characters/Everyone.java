package Objects.Characters;

import Enums.Action;

public class Everyone extends Characters {
    String name;
    private String form;
    public Everyone(String name) {
        super(name);
        this.name = name;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void actPlace(Action a) {
        System.out.print(this.name + " " + a.getAct() + " " + getLocation() + ".\n");
    }
}
