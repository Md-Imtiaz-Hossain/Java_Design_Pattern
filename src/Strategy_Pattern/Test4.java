package Strategy_Pattern;

public class Test4 {
    public static void main(String[] args) {

        ImageStorage imageStorage = new ImageStorage(
                new JpegCompressor(),new BlackFilter() );

        imageStorage.store("Bangladesh");


        imageStorage = new ImageStorage(
                new PngCompressor(),new WhiteFilter() );

        imageStorage.store("Usa");
        
    }
}
