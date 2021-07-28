package task1;

public class Main {
    public static void main(String[] args) {

        Swan swan = new Swan();
        Platypus platypus = new Platypus() {
            @Override
            public void mammal() {

            }
        };

        swan.bird();
        swan.canFly();
        swan.canSwim();

        platypus.mammal();
        platypus.canSwim();

    }
}
