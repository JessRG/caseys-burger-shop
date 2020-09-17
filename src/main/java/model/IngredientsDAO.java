package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDAO implements Ingredients {

    // want a storage variable to hold all the ingredients
    List<Ingredient> ingredients = new ArrayList<>();

    // write the method to find an ingredient by its ID
    @Override
    public Ingredient findById(long id) {
        return ingredients.get((int)id - 1);
    }

    // want a method to create an ingredient and return its newly
    // created ID
    @Override
    public long createIngredient(Ingredient ingredient) {

        // set id of ingredient
        ingredient.setId(ingredients.size() + 1);

        // add ingredient to the ingredients list
        ingredients.add(ingredient);

        // return new ingredient id
        return ingredient.getId();
    }
}
