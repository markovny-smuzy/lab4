import Enums.Action;
import Enums.Adverb;
import Enums.Sign;
import Exceptions.SnusmumrikIsNotInTheTentException;
import Objects.Acting;
import Objects.Actings.*;
import Objects.Characters.Characters;
import Objects.Characters.Everyone;
import Objects.Characters.Hemuls.Hemul;
import Objects.Characters.Hemuls.Hemulens;
import Objects.Characters.Hemuls.LittleHemulen;
import Objects.Characters.Moomins.FrekenSnork;
import Objects.Characters.Moomins.MoomiMom;
import Objects.Characters.Moomins.Moomin;
import Objects.Characters.People.Snusmumrik;
import Objects.Place;
import Objects.Places.MoominValley;
import Objects.Places.RiverTurn;
import Objects.Things.*;

public class Main {
    public static void main(String[] args) throws SnusmumrikIsNotInTheTentException {
        //действующие лица
        Hemul hemul = new Hemul("Хемуль");
        Snusmumrik snusmumrik = new Snusmumrik("Снусмумрик");
        Snusmumrik snusmumrik2 = new Snusmumrik("Снусмумрик");
        Characters they = new Characters("они");
        Characters he = new Characters("он");
        Moomin moomin = new Moomin("Муми-тролль");
        MoomiMom moomiMom = new MoomiMom("Муми-мама");
        Characters nobody = new Characters("Никто");
        Everyone everyone = new Everyone("Все");
        Hemulens hemulens = new Hemulens("хемули");
        FrekenSnork frekenSnork = new FrekenSnork("Фрекен Снорк");
        LittleHemulen littleHemulen = new LittleHemulen("маленькая Хемулиха");

        //одушевленные
        Acting mountain = new Acting("гора");
        Strait strait = new Strait("пролив");
        Acting everything = new Acting("Всё");
        Sunflower sunflower = new Sunflower("подсолнечник");
        Jasmine jasmine = new Jasmine("Жасмин");
        Water water = new Water("вода");
        Whistling whistling = new Whistling("свист");

        //предметы
        Copybook copybook = new Copybook("тетрадь");
        Ankles ankles = new Ankles("лодыжек");
        Barrel barrel = new Barrel("Бочка с водой");
        Railings railings = new Railings("перила", "на веранде", "сделанные вручную");
        Hammock hammock = new Hammock("Гамак");
        ShellsAndSnails shellsAndSnails = new ShellsAndSnails("ракушек и улиток");
        WreathOfRedAlgae wreathOfRedAlgae = new WreathOfRedAlgae("венок из красных водорослей");
        Roof roof = new Roof("крыша");

        //места
        Place way = new Place("путь");
        Place topOfTheHill = new Place("вершину холма");
        Place lilacbushes = new Place("кустов сирени");
        Place porch = new Place("к крылцу");
        Place home = new Place("дома");
        Place livingRoomWindow = new Place("окно гостиной");
        Place riverBank = new Place("на берегу речки");
        Place tent = new Place("палатку");
        Place inItsPlace = new Place("на своём месте");
        Place onTheGardenPaths = new Place("На садовых дорожках");
        Place aroundThePorch = new Place("вокруг крыльца");
        RiverTurn.Bridge bridge = new RiverTurn.Bridge();
        RiverTurn riverTurn = new RiverTurn("поворот реки");
        MoominValley moominValley = new MoominValley("Муми-дола");

        //начало текста

        strait.beganToNarrowDown();
        moominValley.sight();
        roof.andRoof();
        riverTurn.appeared();
        bridge.painted("синий");
        jasmine.blossom("yes");
        everyone.act(Action.WalkedSoFast);
        System.out.print(", что ");
        water.actAdv(Action.Bubbled, Adverb.Around);
        System.out.print("; ");
        everyone.setForm("они");
        everyone.act(Action.Walked);
        System.out.print(", оживленно обсуждая, что им предстоит сделать, когда ");
        everyone.setLocation("домой");
        everyone.actPlace(Action.Returned);
        whistling.setName(Sign.Sharp);
        whistling.cutAir();
        strait.boilingWithHemulens();
        hemulens.everywhere();
        frekenSnork.setLocation("в плечо Муми-тролля");
        frekenSnork.actPlace(Action.BuriedHerHead);
        nobody.nobodySpeech().notSay();
        System.out.print("Это было ужасно: дойти почти до самого дома и оказаться в лапах полицейских. \n");
        hemul.setLocation("им навстречу и остановился перед Снусмумриком");
        hemul.actPlace(Action.WasWalking);
        nobody.nobodySpeech().notAnswer();
        System.out.print("Тут ");
        littleHemulen.act(Action.NimblyDartedForwardToHerCousin);
        System.out.print(", ");
        littleHemulen.blackCalicoNotebook();
        hemul.sig(Sign.Huge);
        System.out.print(", ");
        hemul.advAct(Adverb.WithAGlance, Action.Forced);
        snusmumrik.notSay();
        System.out.print(", ");
        hemul.getThrough(copybook, Action.Open);
        System.out.print(" и ");
        hemul.ActAct(Action.Become, Action.Count);
        System.out.print(".\n");
        he.actAdv(Action.Counted, Adverb.Long);
        System.out.print(", так долго, что ");
        water.act(Action.HadTimeGetDown);
        System.out.print(" до его ");
        ankles.printName();
        System.out.print(".\n");
        System.out.print("Наконец ");
        hemul.say();
        System.out.print("вы должны бежать весь осташийся путь.\n");
        snusmumrik.setLocation("way");
        snusmumrik2.setLocation("way");

        //использую сравнение по location через equals

        if (snusmumrik.equals(snusmumrik2)) {
            way.getCoordinate(Sign.AllRemaining);
            they.act(Action.ToRun);
            System.out.print(".\n");
        }
        else {
            way.getCoordinate(Sign.AllRemaining);
            they.act(Action.NoToRun);
            System.out.print(".\n");
        }

        topOfTheHill.getCoordinate(Adverb.Throught);
        System.out.print(", ");
        lilacbushes.getCoordinate(Adverb.Between);
        System.out.print(" и ");
        porch.getCoordinate(Adverb.Straight);
        System.out.print(".\n");

        System.out.print("Там ");
        they.act(Action.Stopped);
        System.out.print(", и у них словно ");
        mountain.ActShoulders(Action.FellDown);
        System.out.print(".\n");

        they.nActAdv(Action.Standing, Adverb.Silently);
        System.out.print(", чувствуя, что ");
        home.getCoordinate(Adverb.Again);
        System.out.print(".\n");

        everything.actAdv(Action.ItWas, Adverb.AsBefore);
        System.out.print(".\n");

        railings.sig(Sign.Beautiful);
        System.out.print("\n");
        sunflower.wasStillShowingOff();
        barrel.actPlace(Action.SheStanding, inItsPlace);
        System.out.print(".\n");
        hammock.occurredDueTo("от морской воды", Action.Lighter);
        hammock.setColor("светлый");
        hammock.niceColor();
        System.out.print(".\n");
        Puddle.setPuddle(1);
        System.out.print("\n");
        Characters.Author("Автор");
        System.out.print("\n");
        shellsAndSnails.be(Action.ItWasFull, onTheGardenPaths);
        System.out.print(", а ");
        wreathOfRedAlgae.be(Action.Lay, aroundThePorch);
        System.out.print(".\n");
        moomiMom.act(Action.LookedInto, livingRoomWindow);
        System.out.print(".\n");
        moomin.went(Adverb.InTheEvening, tent);
        System.out.print(", чтобы пожелать ему спокойной ночи.\n");
        snusmumrik.setLocation("не в палатке");
        try {
            snusmumrik.sleep();
        } catch (SnusmumrikIsNotInTheTentException e) {
            System.out.println(e.getMessage());
            snusmumrik.satAndSmoked(riverBank);
        }
    }
}