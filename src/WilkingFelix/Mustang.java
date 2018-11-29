package WilkingFelix;

public class Mustang implements Horse{

    private final int weight;
    private final String name;

    public Mustang(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
