package patrones.command;

import java.io.OutputStream;

/**
 */
public interface ICommand {
    public String getCommandName();
    public void exucute(String[] args, OutputStream out);
}
