package routes;

public enum PetStoreRoutes {
    PET("/pet"),
    PET_ID("/pet/{petId}"),
    FIND_BY_STATUS("/pet/findByStatus"),
    STORE_ORDER("/store/order"),
    STORE_ORDER_ORDER_ID("/store/order/{orderId}"),
    USER_CREATE_WITH_ARRAY("/user/createWithArray"),
    USER_CREATE_WITH_LIST("/user/createWithList");
    private final String url;

    PetStoreRoutes(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
