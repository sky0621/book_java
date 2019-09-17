import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class GetCommand implements Command {
    private StoreInfo storeInfo;

    public GetCommand(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

    @Override
    public void exec(String[] args) {
        if (args == null || args.length != 1) {
            System.out.println("not valid");
            return;
        }

        Path p = Paths.get(this.storeInfo.getName());
        try {
            Map<String, String> now = new Gson().fromJson(Files.readAllLines(p).get(0), HashMap.class);
            System.out.println(now.get(args[0]));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
