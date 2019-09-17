import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ListCommand implements Command {
    private StoreInfo storeInfo;

    public ListCommand(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

    @Override
    public void exec(String[] args) {
        Path p = Paths.get(this.storeInfo.getName());
        try {
            Map<String, String> now = new Gson().fromJson(Files.readAllLines(p).get(0), HashMap.class);
            System.out.println("\"key\",\"value\"");
            now.forEach((k, v) -> System.out.printf("\"%s\",\"%s\"\n", k, v));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
