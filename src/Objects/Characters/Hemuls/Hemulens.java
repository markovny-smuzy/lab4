package Objects.Characters.Hemuls;

import Objects.Characters.Characters;

public class Hemulens extends Characters {
    String name;
    public Hemulens(String name) {
        super(name);
        this.name = name;
    }

    public void everywhere() {
        System.out.print("они были впереди, сзади -- повсюду. \n");
    }
}
