package Command_Pattern;

import Command_Pattern.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositCommand implements Command {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    @Override
    public void execute() {

        for (Command command:commandList) {
            command.execute();
        }

    }
}
