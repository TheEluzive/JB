import java.util.ArrayList;

public class Dish implements IDish {
    private ArrayList<Ingredient> ingredients;
    private String name;

    public Dish(ArrayList<Ingredient> ingredients, String name) {
        this.ingredients = ingredients;
        this.name = name;
    }

    @Override
    public void cook() {
        boolean isSalt = false, isSweet = false;
        StringBuffer result = new StringBuffer(); int resultWeight = 0;
        for (Ingredient ingredient:ingredients){
            result.append(ingredient.getName()).append(", ");
            resultWeight += ingredient.getWeight();
            if (ingredient.getTaste() == Taste.SALTY) isSalt = true;
            if (ingredient.getTaste() == Taste.SWEET) isSweet = true;
        }
        result.delete(result.length() - 2, result.length());

        if (isSalt&&isSweet) {
            System.out.println("Блюдо'" + name + "' не готово. Нельзя смешивать солёное со сладким");
            return;
        }
        if (ingredients.size() > 4){
            System.out.println("Блюдо'" + name + "' не готово. Нельзя добавить больше 4-х ингредиентов");
            return;
        }
        System.out.println("Блюдо'" + name + "' готово, ингредиенты " + result + ", общий вес" + resultWeight);
    }
}
