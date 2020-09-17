package model;

public interface Sodas {
    // want a method to find an ingredient by its ID
    Soda findById(long id);

    // method to add an ingredient to our list/cupboard/aresenal/repository
    long createSoda(Soda soda);
}
