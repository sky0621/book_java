import java.io.File;
import java.util.*;

public class Commands {
    private Map<String, Command> commands;

    public Commands(StoreInfo storeInfo) {
        commands = new HashMap<>();
        commands.put("end", new EndCommand());
        commands.put("help", new HelpCommand());
        commands.put("clear", new ClearCommand(storeInfo));
        commands.put("save", new SaveCommand(storeInfo));

        if (!new File(storeInfo.getName()).exists()) {
            commands.get("clear").exec(null);
        }
    }

    public void exec(String[] cmds) {
        if (cmds == null || cmds.length < 1) {
            System.out.println("no target");
            return;
        }

        List<String> cmdList = Arrays.asList(cmds);
        String[] args = cmdList.subList(1, cmdList.size()).toArray(new String[0]);
        this.commands.get(cmds[0]).exec(args);
    }
}
