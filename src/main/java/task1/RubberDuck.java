package task1;

import task1.Birds;
import task1.CanSwim;

public class RubberDuck extends Birds implements CanSwim {

    public void canSwim() {System.out.println("I can swim");}


    public int hashCode() {return super.hashCode();}

    @Override
    public void mammal() {

    }


    public boolean equals (Object obj) {return super.equals(obj);}


    public String toString() {return super.toString();}
}
