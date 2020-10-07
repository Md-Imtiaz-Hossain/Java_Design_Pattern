package Command_Pattern;

import Command_Pattern.fx.Button;

public class Test7 {
    public static void main(String[] args) {


        // Add Customer Through a Button click
        CustomerService service = new CustomerService();
        AddCustomerCommand command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();

        System.out.println("====================================");


        // Execute all Command from where all actions are stored (Storing all command)
        CompositCommand compositCommand = new CompositCommand();
        compositCommand.addCommand(new BlackAndWhiteCommand());
        compositCommand.addCommand(new BlackAndWhiteCommand());
        compositCommand.addCommand(new ResizeCommand());

        compositCommand.execute();
        compositCommand.execute();





    }
}
