package Objects.Actings;

import Objects.Acting;

public class Jasmine extends Acting{
    private String name;
    public Jasmine(String name) {
        super(name);
        this.name = name;
    }

    public void blossom(String s) {
        if (s == "yes")
            System.out.print(this.name + " уже расцвёл!");
        else
            System.out.print(this.name + " пока не расцвёл :[");
    }
}
