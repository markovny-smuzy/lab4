package Objects.Things;

import Objects.Obj;

public class Roof extends Obj {
    String name;
    public Roof(String name) {
        super(name);
        this.name = name;
    }

    //вложенный класс (non-static)
    private class Flag {
        public void wavingFlag() {
            System.out.print("с весело развевающимся флагом... \n");
        }
    }

    public void andRoof() {
        System.out.print("И крыша ");

        Flag flag = new Flag();
        flag.wavingFlag();
    }
}
