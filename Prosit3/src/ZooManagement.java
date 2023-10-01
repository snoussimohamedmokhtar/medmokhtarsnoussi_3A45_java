public class ZooManagement {

    public static void main(String[] arg)
    {
        Animal lion1 = new Animal("lion", "simba", 12, true);
        Animal lion2 = new Animal("lion", "zuma", 10, true);
        Animal hipo1 = new Animal("hipo", "karo", 5, true);
        Animal eagle1 = new Animal("eagle", "manja", 4, false);
        Zoo myZoo = new Zoo("myZoo", "NY");
        Zoo myZoo2 = new Zoo("myZoo2", "blv");
        myZoo.DisplayZoo();
        System.out.println(myZoo);
        //System.out.println(myZoo.toString());
        System.out.println(lion1);
        myZoo.addAnimal(lion1);
        myZoo.addAnimal(lion2);
        myZoo.addAnimal(hipo1);
        myZoo.printAnimals();
        /*int indice = myZoo.searchAnimal(hipo1);
        int indice2 = myZoo.searchAnimal(eagle1);
        if(indice!=-1)
            System.out.println("hipo1 found !!");
        else
            System.out.println("hipo1 not found :'(");

        System.out.println("////////////////////////////");
        if(indice2!=-1)
            System.out.println("eagle1 found !!");
        else
            System.out.println("eagle1 not found :'(");*/

        myZoo.removeAnimal(hipo1);
        System.out.println(myZoo);
        if(myZoo.isZooFull())
            System.out.println("this zoo is full!!");

        Zoo zoo = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println(zoo);

    }
}
