package State_Pattern;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println(" Selection tool.");
    }

    @Override
    public void mouseUp() {
        System.out.println(" Erase Something.");

    }

    public void addition(){
        System.out.println("Addition");
    }

}
