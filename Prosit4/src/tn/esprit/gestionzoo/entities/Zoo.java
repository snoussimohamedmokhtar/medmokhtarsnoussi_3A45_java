package tn.esprit.gestionzoo.entities;
import java.util.Objects;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;

    public Animal[] getAnimals() {return animals;}
    public String getName() {return name;}
    public String getCity() {return city;}
    public int getNbrCages() {return nbrCages;}

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        if(!Objects.equals(name, " ")) {
            this.name = name;
        }
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Zoo(String name, String city)
    {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }
    public void DisplayZoo()
    {
        System.out.println(name);
        System.out.println(city);
        System.out.println(nbrCages);
    }
    public String toString()
    {
        String s = name+ " "+ city+ " "+ nbrCages;
        return s;
    }
    public boolean addAnimal(Animal animal){
        if(searchAnimal(animal)==-1 && !isZooFull()) {
            Animal[] animals2 = new Animal[animals.length + 1];
            System.arraycopy(animals, 0, animals2, 0, animals.length);
            animals2[animals2.length - 1] = animal;
            animals = animals2;
            return true;
        }
        else
            return false;
    }
    public void printAnimals()
    {
        for(int i=0; i<animals.length; i++)
            System.out.println(animals[i]);
    }
    public int searchAnimal(Animal animal) {
        for(int i=0; i<animals.length; i++) {
            if(animal.getName().equals(animals[i].getName()))
                 return i+1;
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int indice = searchAnimal(animal);
        int j=0;
        if(indice != -1) {
            Animal[] animals1 = new Animal[animals.length - 1];
            for(int i=0; i<animals.length; i++) {
                if(i!=indice) {
                    animals1[j] = animals[i];
                    j++;
                }
            }
            animals = animals1;
            return true;
        }
        else
            return false;
    }

    public boolean isZooFull() {
        return animals.length == nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if(z1.animals.length > z2.animals.length)
            return z1;
        else return z2;
    }
}