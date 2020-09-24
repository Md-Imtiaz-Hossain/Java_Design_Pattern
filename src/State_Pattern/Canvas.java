package State_Pattern;

public class Canvas {

    private Tool currentToll;


    public void mouseDown(){
        currentToll.mouseDown();

    }

    public void mouseUp(){
        currentToll.mouseUp();

    }

    public Tool getCurrentToll() {
        return currentToll;
    }

    public void setCurrentToll(Tool currentToll) {
        this.currentToll = currentToll;
    }


}
