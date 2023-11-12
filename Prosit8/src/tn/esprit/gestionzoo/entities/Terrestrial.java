package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore {
    protected int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public String toString()
    {
        String s = getFamily()+ " "+ getName()+ " "+ getAge()+ " "+ getIsMammal()+ " "+ nbrLegs;
        return s;
    }

    @Override
    public void eatMeat(Object meat) {
        if(meat.equals("MEAT"))
            System.out.println("Terrestrial carnivore");
    }

    @Override
    public void eatPlant(Object plant) {
        if(plant.equals("PLANT"))
            System.out.println("Terrestrial Herbivore");
    }

    @Override
    public void eatPlantAndMeet(Object food) {
        if(food.equals("BOTH"))
            System.out.println("Terrestrial Omnivore");
    }
}
