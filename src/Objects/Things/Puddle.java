package Objects.Things;

import Exceptions.NegativeNumberOfPuddlesException;
import Objects.Obj;

public class Puddle extends Obj {
    String name;
    int count;
    public Puddle(String name) {
        super(name);
        this.name = name;
    }
    public static void setPuddle(int count) throws NegativeNumberOfPuddlesException {
        if(count<0)
            throw new NegativeNumberOfPuddlesException();
        else if(count==1)
            System.out.print("В единственной луже отражалось небо, и она вполне годилась малышке Мю -- для купания.");
        else if(1 < count && count <= 10)
            System.out.print("Луж было несколько,и одна вполне годилась малышке Мю -- для купания.");
        else
            System.out.print("Луж было " + count + ",и одна вполне годилась малышке Мю -- для купания.");
    }
}
