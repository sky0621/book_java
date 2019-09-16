import org.apache.commons.lang3.StringUtils;

public class StoreInfo {
    private static final String DEFAULT_STORE_NAME = "store.json";

    private String storeName;

    public StoreInfo(String storeName) {
        if (StringUtils.isEmpty(storeName)) {
            this.storeName = DEFAULT_STORE_NAME;
        } else {
            this.storeName = storeName;
        }
    }

    public String getName() {
        return this.storeName;
    }
}
