package Iterator_Pattern;

import Mementro_Pattern.History;

public class Test3 {

    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();


        history.push("A");
        history.push("B");
        history.push("C");
        history.push("D");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            String url = iterator.current();

            System.out.println(url);
            iterator.next();
        }

    }

}
