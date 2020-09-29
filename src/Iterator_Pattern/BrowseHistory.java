package Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BrowseHistory {



    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count] = url;
        count++;
    }

    public String pop(){
        count--;
        return urls[count];
    }


    public Iterator createIterator(){
        return new ArrayIterator(this);
    }



    public class ArrayIterator implements Iterator{

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;

        }
    }









// If we create another list the any of other class none effected.. only current class effected...







//
//    private List<String> urls = new ArrayList<>();
//
//    //private String[] urls = new String[10];
//
//    public void push(String url) {
//        urls.add(url);
//    }
//
//    public String pop(){
//
//        int lastIndex = urls.size()-1;
//        String lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//
//        return lastUrl;
//    }
//
//
//    public Iterator createIterator(){
//        return new ListIterator(this);
//    }
//
//
//
//
//    public class ListIterator implements Iterator{
//
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history){
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }




}
