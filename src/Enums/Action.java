package Enums;

//действия объектов

public enum Action {
    Forced("заставил"),
    Begin("начал"),
    NarrowDown("сужаться"),
    Open("открыл"),
    Become("стал"),
    Count("считать"),
    Counted("Cчитал"),
    HadTimeGetDown("успела опуститься"),
    ToRun("бежали"),
    NoToRun("не бежали"),
    Stopped("остановились"),
    FellDown("свалилась"),
    Standing("стояли"),
    SheStanding("стояла"),
    ItWas("было"),
    Lighter("посветлел"),
    LookedInto("заглянула в"),
    ItWasFull("было полно"),
    Lay("лежал"),
    WalkedSoFast("зашагали так быстро"),
    Walked("шли"),
    Returned("вернутся"),
    BuriedHerHead("уткнулась головой"),
    WasWalking("шёл"),
    NimblyDartedForwardToHerCousin("проворно шмыгнула вперед к двоюродному брату"),
    Bubbled("забурлила");

    private String name;
    Action(String name) {
        this.name = name;
    }

    public String getAct() {
        return name;
    }
}
