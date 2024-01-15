package Objects.Actings;

import Objects.Acting;

public class Sunflower extends Acting {
    private String name;
    public Sunflower(String name) {
        super(name);
        this.name = name;
    }
    public void wasStillShowingOff() {
        System.out.println("По-прежнему красовался " + this.name + ".");
    }
}
