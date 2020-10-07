package Command_Pattern;

import Command_Pattern.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize.");
    }
}
