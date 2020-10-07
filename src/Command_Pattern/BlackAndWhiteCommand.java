package Command_Pattern;

import Command_Pattern.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black And White Command.");
    }
}
