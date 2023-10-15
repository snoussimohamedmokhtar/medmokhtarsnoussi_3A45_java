package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;
    Aquatic(){};
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public String toString()
    {
        String s = getFamily()+ " "+ getName()+ " "+ getAge()+ " "+ getIsMammal()+ " "+ habitat;
        return s;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
