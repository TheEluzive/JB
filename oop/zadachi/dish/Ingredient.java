public class Ingredient {

    private Taste taste;
    private int weight;
    private String name;

    public Ingredient(Taste taste, int weight, String name) {
        this.taste = taste;
        this.weight = weight;
        this.name = name;
    }

    public Taste getTaste() {
        return taste;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

}




