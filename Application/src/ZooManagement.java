import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] arg)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("nbr cages ? : ");
        String nbrCages = obj.nextLine();
        String zooName = "my zoo";
        System.out.println(zooName+ " comporte "+ nbrCages+ " cages");
    }
}
