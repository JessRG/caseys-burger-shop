package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDAO implements Sodas {

    // want a storage variable to hold all the ingredients
    List<Soda> sodas = new ArrayList<>();

    @Override
    public Soda findById(long id) {
        return sodas.get((int)id - 1);
    }

    @Override
    public long createSoda(Soda soda) {
        // set id of ingredient
        soda.setId(sodas.size() - 1);

        // add soda to the sodas list
        sodas.add(soda);

        // return new soda id
        return soda.getId();
    }
}
