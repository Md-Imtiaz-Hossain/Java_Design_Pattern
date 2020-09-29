package Strategy_Pattern;

public class ImageStorage {

    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileNAme){
        compressor.compress(fileNAme);
        filter.apply(fileNAme);
    }

}
