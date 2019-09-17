import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClearCommand implements Command {
    private StoreInfo storeInfo;

    public ClearCommand(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

    @Override
    public void exec(String[] args) {
        try {
            Files.write(Paths.get(storeInfo.getName()), "{}".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
