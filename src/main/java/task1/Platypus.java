package task1;

import task1.Birds;
import task1.CanEat;
import task1.CanFly;
import task1.CanSwim;

public abstract class Platypus extends Birds implements CanFly, CanSwim, CanEat {

    public void canFly() {System.out.println("i can Fly");}

    public void canSwim() {System.out.println("I can swim");}


    public int hashCode() {return super.hashCode();}


    public boolean equals (Object obj) {return super.equals(obj);}


    public String toString() {return super.toString();}


    public void canEat() {System.out.println("I can eat grass");}


}
