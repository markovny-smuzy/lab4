package Objects.Characters.People;

import Exceptions.SnusmumrikIsNotInTheTentException;
import Objects.Characters.Characters;
import Objects.Place;

public class Snusmumrik extends Characters {
    private String location;
    public Snusmumrik(String name){
        super(name);
        this.name = name;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }

    public void sleep() throws SnusmumrikIsNotInTheTentException {
        if (location == "в палатке") {
            System.out.println("Снусмумрик засыпает в палатке.");
        }
        else {
            throw new SnusmumrikIsNotInTheTentException("Снусмумрика не было в палатке.");
        }
    }
    public void satAndSmoked(Place p) {
        System.out.println("Тот сидел и курил " + p.getName() + ".");
    }
}
