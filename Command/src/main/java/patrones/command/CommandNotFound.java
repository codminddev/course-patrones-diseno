package patrones.command;

import java.io.OutputStream;

public class CommandNotFound extends AbstractCommand{
    
    public static final String COMMAND_NAME = "notfound";
    
    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }

    @Override
    public void exucute(String[] args, OutputStream out) {
        write(out, "Command not found..");
    }
    
}
