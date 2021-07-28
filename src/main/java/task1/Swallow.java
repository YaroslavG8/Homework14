package task1;

import task1.Birds;
import task1.CanEat;
import task1.CanFly;

public class Swallow extends Birds implements CanFly, CanEat {

    public void canFly() {System.out.println("i can Fly");}

    public int hashCode() {return super.hashCode();}

    @Override
    public void mammal() {

    }


    public boolean equals (Object obj) {return super.equals(obj);}


    public String toString() {return super.toString();}


    public void canEat() {System.out.println("I can eat bugs");}






}
