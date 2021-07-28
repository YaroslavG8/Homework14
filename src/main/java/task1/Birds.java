package task1;

import java.util.Objects;

public abstract class Birds {
    public void bird () {System.out.println("I'm bird"); }

    boolean haveBeak = true;

    public boolean isHaveBeak() {
        return haveBeak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return haveBeak == birds.haveBeak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(haveBeak);
    }

    public abstract void mammal();
}
