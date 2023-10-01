public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

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
        String s = family + " "+ name+ " "+ age+ " "+ isMammal;
        return s;
    }
}
