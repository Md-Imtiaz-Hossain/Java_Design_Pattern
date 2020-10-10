package Observer_Pattern;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spread Sheet Got Notify - " + value);
    }
}
