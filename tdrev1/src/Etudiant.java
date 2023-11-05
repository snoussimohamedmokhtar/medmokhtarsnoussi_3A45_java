public abstract class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private float moy;

    public Etudiant (int id, String nom, String prenom, float moy) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.moy=moy;
    }

    public int getId() {return id;}
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public float getMoy() {return moy;}
    public void setMoy(float moy){this.moy = moy;}

    public boolean equals(Etudiant etudiant) {
        return this.id==etudiant.id && this.nom.equals(etudiant.nom);
    }
    public String toString()
    {
        String s = id+ " "+ nom+ " "+ prenom+ " "+ moy;
        return s;
    }
    public abstract void ajouterUneAbsence();
}
