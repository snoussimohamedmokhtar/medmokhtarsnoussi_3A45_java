package tn.esprit.gestionzoo.entities;
import java.util.Objects;

public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private final int nbrCages = 3;

    public Animal[] getAnimals() {return animals;}
    public Aquatic[] getAquaticAnimals(){return aquaticAnimals;}
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
    public void addAnimal(Animal animal){
        try {
            Animal[] animals2 = new Animal[animals.length + 1];
            System.arraycopy(animals, 0, animals2, 0, animals.length);
            animals2[animals2.length - 1] = animal;
            animals = animals2;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            ZooFullException xp = new ZooFullException();
            xp.zooFullException();
        }
    }
    public void addAquaticAnimal(Aquatic aquatic) {

        Aquatic[] aquatic2 = new Aquatic[aquaticAnimals.length + 1];
        System.arraycopy(aquaticAnimals, 0, aquatic2, 0, aquaticAnimals.length);
        aquatic2[aquatic2.length - 1] = aquatic;
        aquaticAnimals = aquatic2;
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

    public float maxPenguinSwimmingDepth() {
        float maxl = 0;
        for(int i=0; i<aquaticAnimals.length;i++) {
            if(aquaticAnimals[i] instanceof Penguin && ((Penguin) aquaticAnimals[i]).swimmingDepth>maxl) {
                maxl = ((Penguin) aquaticAnimals[i]).swimmingDepth;
            }
        }
        return maxl;
    }
    public void displayNumberOfAquaticsByType() {
        int nbd = 0;
        int nbp = 0;
        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Penguin)
                nbp++;
            if (aquaticAnimal instanceof Dolphin)
                nbd++;
        }
        System.out.println("nbr dolphins : " + nbd);
        System.out.println("nbr penguin : " + nbp);
    }
    /*if (penguin1 instanceof Penguin) {
        System.out.println("penguin1 is a Penguin");*/
}