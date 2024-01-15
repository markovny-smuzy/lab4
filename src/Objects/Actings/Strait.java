package Objects.Actings;

import Objects.Acting;

public class Strait extends Acting {
    private String name;
    public Strait(String name) {
        super(name);
        this.name = name;
    }

    public void boilingWithHemulens() {
        System.out.print("В один миг " + this.name + " закипел хемулями, ");
    }
    public void beganToNarrowDown() {
        System.out.println("Вот " + this.name + " начал сужаться.");
    }
    public void beganToSpill() {
        System.out.println("Вот " + this.name + " начал разливаться.");
    }
}
