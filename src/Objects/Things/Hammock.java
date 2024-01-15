package Objects.Things;

import Enums.Action;
import Objects.Acting;
import Objects.Actings.Sunflower;

public class Hammock extends Acting {
    String name;
    String color;
    public Hammock(String name) {
        super(name);
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getCount(){
        return color;
    }

    public void occurredDueTo(String a, Action a2) {
        System.out.print(this.name + " " + a + " " + a2.getAct());
    }
    public void niceColor(){
        if (color == "светлый")
            System.out.print(" и стал приятного цвета.");
        else
            System.out.print(" и стал неприятного цвета.");
        }

}
