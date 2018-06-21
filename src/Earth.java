public enum Earth {
    NORTH("północ"),
    EAST("wschód"),
    SOUTH("południe"),
    WEST("zachód");
    private String description;

    Earth(String desc) {
        description = desc;
        }

    public String getDescription() {
        return description;
    }
}