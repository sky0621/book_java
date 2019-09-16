public class SaveCommand implements Command {
    private StoreInfo storeInfo;

    public SaveCommand(StoreInfo storeInfo) {
        this.storeInfo = storeInfo;
    }

    @Override
    public void exec(String[] args) {

    }
}
