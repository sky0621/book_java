import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class RemoveCommand implements Command {
    private StoreInfo storeInfo;

    public RemoveCommand(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

    @Override
    public void exec(String[] args) {
        if (args == null || args.length != 1) {
            System.out.println("not valid");
            return;
        }

        Gson gson = new Gson();
        Path p = Paths.get(this.storeInfo.getName());
        try {
            Map<String, String> now = gson.fromJson(Files.readAllLines(p).get(0), HashMap.class);
            now.remove(args[0]);
            Files.write(p, gson.toJson(now).getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
