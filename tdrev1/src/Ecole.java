public class Ecole {
    Etudiant[] etudiants;
    private String nom;
    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[500];
    }
    public String getNom() {return nom;}
    public Etudiant[] getEtudiants() {return etudiants;}

    public int rechercherEtudiant (Etudiant e) {
        for (int i=0; i<etudiants.length; i++)
        {
            if (e.getId()==etudiants[i].getId())
                return i;
        }
        return -1;
    }
    public void ajouterEtudiant(Etudiant etudiant) {
        if(rechercherEtudiant(etudiant)==-1) {
            Etudiant[] etudiants1 = new Etudiant[etudiants.length + 1];
            System.arraycopy(etudiants, 0, etudiants1, 0, etudiants.length);
            etudiants1[etudiants1.length - 1] = etudiant;
            etudiants = etudiants1;
        }
    }

    public float getMoyenneDes3A() {
        float moy = 0; int nb = 0;
        for(int i=0; i<etudiants.length; i++) {
            if(etudiants[i].getClass().equals("3A")) {
                moy = moy + etudiants[i].getMoy();
                nb++;
            }
        }
        float v = moy / nb;
        return v;
    }
    public String toString() {
        String s = "Nom : "+ this.nom+ "Etudiants : \n";
        for(int i=0; i<etudiants.length; i++) {
            s += etudiants[i].toString()+"\n";
        }
        return s;
    }

}
