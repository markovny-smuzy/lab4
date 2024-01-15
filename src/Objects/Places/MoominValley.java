package Objects.Places;

import Objects.Place;
//В теснине между скалистыми берегами уже виднелась нежная зелень Муми-дола.

public class MoominValley extends Place {
    String name;

    public MoominValley(String name) {
        super(name);
        this.name = name;
    }

    //вложенный класс (non-static)
    private class Greenery {
        public void wasVisible(String pl) {
            System.out.print(pl + " уже виднелась нежная зелень ");
        }
    }
//sight-достопримеательность(какбы нежная зелень - достопримечательность Муми-дола)
    public void sight() {
        MoominValley.Greenery greenery = new MoominValley.Greenery();
        greenery.wasVisible("В теснине между скалистыми берегами");
        System.out.print(this.name + ". \n");
    }
}
