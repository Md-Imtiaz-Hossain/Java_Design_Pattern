package Observer_Pattern;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spread Sheet Got Notify - " + value);
    }
}
