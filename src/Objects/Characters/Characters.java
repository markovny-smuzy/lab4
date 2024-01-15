package Objects.Characters;

import Enums.*;
import Interfaces.Active;
import Interfaces.Attribute;
import Interfaces.Gettable;
import Interfaces.Speech;
import Objects.Obj;

public class Characters extends Obj implements Speech, Attribute, Active {

    public String name;
    public String location;
    public Characters(String name) {
        super(name);
        this.name = name;
    }

//анонимный класс

    public static void Author(String name) {
        Characters anonAuthor = new Characters("Автор") {
            @Override
            public void say() {
                System.out.print("Казалось, будто ничего не произошло и никогда больше им не будет грозить опасность. ");
            }
        };
        anonAuthor.say();
    }

//локальный класс

    public Speech nobodySpeech() {
        class CharacterNobodySpeech implements Speech {
            @Override
            public void say() {
                System.out.print("Никто что-то сказал. \n");
            }

            @Override
            public void notSay() {
                    System.out.print("Никто не сказал ни слова. \n");
            }
            @Override
            public void notAnswer() {
                System.out.print("Никто не ответил. \n");
            }
        }
        return new CharacterNobodySpeech();
    }

    @Override
    public void act(Action a) {
        System.out.print(this.name + " " + a.getAct());
    }
    public void advAct(Adverb adv, Action a) {
        System.out.print(adv.getAdv() + " " + a.getAct() + " ");
    }
    public void ActAct(Action a1, Action a2) {
        System.out.print(a1.getAct() + " " + a2.getAct());
    }
    public void nActAdv(Action a, Adverb adv) {
        System.out.print(this.name + " " + a.getAct() + " " + adv.getAdv());
    }
    public void actAdv(Action a, Adverb adv) {
        System.out.print(a.getAct() + " " + this.name + " " + adv.getAdv());
    }

    @Override
    public void say() {
        System.out.print(this.name + " произнёс:");
    }

    @Override
    public void notSay() {
        System.out.print(this.name + "а" + " умолкнуть");
    }

    @Override
    public void notAnswer() {
        System.out.print(this.name + " не ответил.");
    }


    @Override
    public void sig(Sign s) {
        System.out.print(s.getSig() + " " + this.name);
    }

    public void getThrough(Gettable g, Action a) {
        System.out.print(a.getAct() + " " + g.getName());
    }
}
