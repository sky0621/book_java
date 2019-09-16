import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SaveCommand implements Command {
    private StoreInfo storeInfo;

    public SaveCommand(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

    @Override
    public void exec(String[] args) {
        if (args == null || args.length != 2) {
            System.out.println("not valid");
            return;
        }

        try {
            List<String> allLines = Files.readAllLines(Paths.get(this.storeInfo.getName()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        String json = null;
        try {
            json = new ObjectMapper().writeValueAsString("{}");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }
}
