package Strategy_Pattern;

public class WhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Filtering with White Filter");
    }
}
