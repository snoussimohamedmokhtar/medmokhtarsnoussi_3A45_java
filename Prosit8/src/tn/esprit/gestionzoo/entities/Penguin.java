package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public String toString()
    {
        String s = getFamily()+ " "+ getName()+ " "+ getAge()+ " "+ getIsMammal()+ " "+ habitat+ " "+ swimmingDepth;
        return s;
    }
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

}
