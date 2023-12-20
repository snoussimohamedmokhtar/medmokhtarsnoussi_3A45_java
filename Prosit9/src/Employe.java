public class Employe implements Comparable<Employe>{
    private int id;
    private String nom;
    private String prenom;
    private String nom_dep;
    private int grade;
    public Employe(){

    }
    public Employe(int id, String nom, String prenom, String nom_dep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_dep = nom_dep;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public boolean equals(Employe e) {
        return (id==e.getId() && nom.equals(e.getNom()));
    }
    public String toString() {
        return id + " " + nom + " " + prenom +" " + nom_dep + " " + grade;
    }
    @Override 
    public int compareTo(Employe other) {
        return this.getId() - other.getId();
    }


}
