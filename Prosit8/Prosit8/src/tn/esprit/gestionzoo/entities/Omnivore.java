package tn.esprit.gestionzoo.entities;

public interface Omnivore<T> extends Herbivore, Carnivore{
    void eatPlantAndMeet(T food);
}
