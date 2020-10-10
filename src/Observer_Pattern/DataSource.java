package Observer_Pattern;

public class DataSource extends Subject {

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }

    private int value;

}
