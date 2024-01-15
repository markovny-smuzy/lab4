package Objects.Places;

import Objects.Place;

public class RiverTurn extends Place {
    String name;

    public RiverTurn(String name) {
        super(name);
        this.name = name;
    }

    public void appeared(){
        System.out.print("Вот показался " + this.name);
    }

    //вложенный класс (static)
    public static class Bridge {
        public void painted(String color) {
            System.out.print(" и за ним мост, выкрашенный в "+ color +" цвет.\n");
        }
    }
}
