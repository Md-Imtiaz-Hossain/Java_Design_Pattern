package Strategy_Pattern;

public class BlackFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Filtering with Black Filter");
    }
}
