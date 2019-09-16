import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClearCommand implements Command {
    private StoreInfo storeInfo;

    public ClearCommand(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

    @Override
    public void exec(String[] args) {
        Path p = Paths.get(storeInfo.getName());
        try {
            Files.createFile(p);
        } catch (IOException e) {
            // FIXME:
        }
    }
}
