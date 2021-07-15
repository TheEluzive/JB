import java.util.ArrayList;

public class mainDish {
    public static void main(String[] args) {
        Ingredient potato = new Ingredient(Taste.BITTER, 1000, "картофель");
        Ingredient cucumber = new Ingredient(Taste.SALTY, 200, "огурец");
        Ingredient sugar = new Ingredient(Taste.SWEET, 1000, "Сахар");
        Ingredient water = new Ingredient(Taste.BITTER, 100, "вода");
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(potato);
        ingredients.add(cucumber);
        ingredients.add(water);



        Dish soup = new Dish(ingredients, "суп");
        soup.cook();

        ingredients.add(sugar);
        soup.cook();
    }
}
