public class Ecole {
    Etudiant[] etudiants;
    private String nom;
    private int nbrEtudiants;

    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[500];
    }
    public String getNom() {return nom;}
    public int getNbrEtudiants() {return nbrEtudiants;}
    public Etudiant[] getEtudiants() {return etudiants;}

    public int rechercherEtudiant (Etudiant e) {
        for (int i=0; i<nbrEtudiants; i++)
        {
            if (e.getId()==etudiants[i].getId())
                return i;
        }
        return -1;
    }
}
