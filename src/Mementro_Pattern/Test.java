package Mementro_Pattern;

public class Test {
    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();

        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());

        editor.setContent("C");
        editor.restore(history.pop());

        System.out.println(editor.getContent() );






// ========================= Challenge ==============================================
//
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.setContent("A"); editor.setFontName("Arial"); editor.setFontSize(20);
//        history.push(editor.createState());
//
//        editor.setContent("B"); editor.setFontName("Arial 2"); editor.setFontSize(202);
//        history.push(editor.createState());
//
//        editor.setContent("c"); editor.setFontName("Arial 3"); editor.setFontSize(2000);
//        editor.restore(history.pop());
//
//        System.out.println(editor.getContent() + " , " + editor.getFontName() + " , " + editor.getFontSize());









    }
}
