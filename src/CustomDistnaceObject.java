import java.util.Objects;

public class CustomDistnaceObject {
    private int number;

    private int distance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomDistnaceObject)) return false;
        CustomDistnaceObject that = (CustomDistnaceObject) o;
        return getNumber() == that.getNumber() && getDistance() == that.getDistance();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getDistance());
    }

    @Override
    public String toString() {
        return "CustomDistnaceObject{" +
                "number=" + number +
                ", distance=" + distance +
                '}';
    }

    public CustomDistnaceObject(int number, int distance) {
        this.number = number;
        this.distance = distance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
