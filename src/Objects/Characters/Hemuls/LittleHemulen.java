package Objects.Characters.Hemuls;

import Objects.Characters.Characters;

public class LittleHemulen extends Characters {
    String name;
    public LittleHemulen(String name) {
        super(name);
        this.name = name;
    }

    public void blackCalicoNotebook() {
        System.out.print("поклонилась и протянула ему черную коленкоровую тетрадь.\n");
    }
}