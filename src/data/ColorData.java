package data;

public enum ColorData {
    WHITE("белый"),
    BLACK("черный"),
    RED("рыжий");

    private String name;

    ColorData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }
}
