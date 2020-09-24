package State_Pattern;

public class Test2 {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();
        canvas.setCurrentToll(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        EraserTool eraserTool = new EraserTool();
        eraserTool.addition();

    }
}
