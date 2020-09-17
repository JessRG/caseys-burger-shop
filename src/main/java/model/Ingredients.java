package model;

import java.util.ArrayList;
import java.util.List;

public interface Ingredients {

    // want a method to find an ingredient by its ID
    Ingredient findById(long id);

    // method to add an ingredient to our list/cupboard/aresenal/repository
    long createIngredient(Ingredient ingredient);
}
