import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> employeList = new ArrayList<>();

    public void ajouterEmploye(Employe t)
    {
        employeList.add(t);
    }
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employeList) {
            if (nom.equals(employe.getNom()))
                return true;
        }
        return false;
    }
    public boolean rechercherEmploye(Employe t) {
        return employeList.contains(t);
    }
    public void supprimerEmploye(Employe t) {
        employeList.remove(t);
    }
    public void displayEmploye() {
        for(Employe employe : employeList) {
            System.out.println(employe);
        }
    }
    public void trierEmployerParld() {
        Collections.sort(employeList);
    }
    public void trierEmployerParNomDepartementEtGrade() {
        Comparator<Employe> depComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNom_dep().compareTo(o2.getNom_dep());
            }
        };
        Comparator<Employe> gradeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };
        Collections.sort(employeList, depComparator.thenComparing(gradeComparator));
    }
}
