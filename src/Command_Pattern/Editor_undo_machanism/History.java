package Command_Pattern.Editor_undo_machanism;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand undoableCommand){
        commands.push(undoableCommand);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }

    public int size(){
        return commands.size();
    }

}
