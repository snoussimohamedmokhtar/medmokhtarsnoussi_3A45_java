package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;
    Aquatic(){};

    public String getHabitat() {
        return habitat;
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public String toString()
    {
        String s = getFamily()+ " "+ getName()+ " "+ getAge()+ " "+ getIsMammal()+ " "+ habitat;
        return s;
    }
    public abstract void swim();
    public boolean equals(Aquatic aquatic) {
        if(aquatic.getName().equals(this.getName()) && aquatic.getAge()==this.getAge() && aquatic.getHabitat().equals(this.getHabitat()))
            return true;
        else
            return false;
    }
}
