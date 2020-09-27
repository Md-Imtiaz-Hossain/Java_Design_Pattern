package Iterator_Pattern;

public interface Iterator<T> {
    boolean hasNext();
    String current();
    void next();
}
