public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;

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
    boolean addAnimal(Animal animal){
        if(searchAnimal(animal)==-1 && animals.length<25) {
            Animal[] animals2 = new Animal[animals.length + 1];
            System.arraycopy(animals, 0, animals2, 0, animals.length);
            animals2[animals2.length - 1] = animal;
            animals = animals2;
            return true;
        }
        else
            return false;
    }
    void printAnimals()
    {
        for(int i=0; i<animals.length; i++)
            System.out.println(animals[i]);
    }
    int searchAnimal(Animal animal) {
        for(int i=0; i<animals.length; i++) {
            if(animal.name.equals(animals[i].name))
                 return i+1;
        }
        return -1;
    }
    boolean removeAnimal(Animal animal) {
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
            animals =animals1;
            return true;
        }
        else
            return false ;
    }

    boolean isZooFull() {
        return animals.length == nbrCages;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if(z1.animals.length > z2.animals.length)
            return z1;
        else return z2;
    }
}