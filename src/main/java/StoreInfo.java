public class StoreInfo {
    private static final String DEFAULT_STORE_NAME = "store.json";

    private String storeName;

    public StoreInfo(String storeName) {
        this.storeName = storeName;
    }

    public String getName() {
        return this.storeName;
    }
}
