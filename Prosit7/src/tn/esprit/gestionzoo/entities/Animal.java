package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public String getFamily() {return family;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public boolean getIsMammal() {return isMammal;}

    public void setFamily(String newFamily){family = newFamily;}
    public void setName(String newName){name = newName;}
    public void setAge(int newAge) {
        if(newAge>=0) {
            age = newAge;
        }
    }
    public void setIsMammal(boolean newIsMammal){isMammal = newIsMammal;}
    Animal(){};
    public Animal (String family, String name, int age, boolean isMammal)
    {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void DisplayAnimal()
    {
        System.out.println(family);
        System.out.println(name);
        System.out.println(age);
        System.out.println(isMammal);
    }
    public String toString()
    {
        String s = family+ " "+ name+ " "+ age+ " "+ isMammal;
        return s;
    }
}
