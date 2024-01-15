package Objects.Things;

import Enums.Sign;
import Interfaces.Attribute;
import Objects.Obj;

public class Railings extends Obj implements Attribute {
    private String name, location, madeHow;

    public Railings(String name, String location, String madeHow){
        super(name);
        this.location = location;
        this.name = name;
        this.madeHow = madeHow;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void sig(Sign s) {
        System.out.print(s.getSig() + " " + this.name + " " + this.location + ", " + this.madeHow + ", ");
        if (this.madeHow == "сделанные вручную") {
            System.out.print("не сломались.");
        }
        else {
            System.out.print("сломались.");
        }
    }


}
