package springMvc.entity;

public class Heroes {
    private int id;
    private String name;
    private String rang;

    public Heroes(int id, String name, String rang) {
        this.id = id;
        this.name = name;
        this.rang = rang;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRang() {
        return rang;
    }

}
