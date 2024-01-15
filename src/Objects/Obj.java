package Objects;

import Objects.Characters.Characters;

import java.util.Objects;

public abstract class Obj {
    public String location;
    protected String name;
    public Obj(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public void printName() {
        System.out.print(name);
    }

    @Override
    public String toString() {
        return name;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characters that = (Characters) o;
        return Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

}
