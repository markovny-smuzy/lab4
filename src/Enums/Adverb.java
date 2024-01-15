package Enums;

//наречия

public enum Adverb {
    Here("Вот"),
    WithAGlance("взглядом"),
    Long("долго"),
    SoLong("так долго, что"),
    Finally("Наконец"),
    Throught("Через"),
    Between("меж"),
    Straight("прямо"),
    AsIf("словно"),
    Silently("молча"),
    Again("снова"),
    AsBefore("как прежде"),
    Around("вокруг"),
    Suddenly("Вдруг"),
    InTheEvening("Вечером");


    private String name;
    Adverb(String name) {
        this.name = name;
    }

    public String getAdv() {
        return name;
    }

    public static void printAdv(Adverb a) {
        System.out.print(a.getAdv());
    }
}
