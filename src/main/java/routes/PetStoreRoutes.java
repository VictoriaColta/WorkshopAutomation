package routes;

public enum PetStoreRoutes {
    PET("/pet"),
    FIND_BY_STATUS("/pet/findByStatus");
    private final String url;

    PetStoreRoutes(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
