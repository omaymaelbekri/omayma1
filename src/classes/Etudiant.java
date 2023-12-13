package classes;

import java.util.List;

public class Etudiant {
    private String nom;
    private List<Matière> matières;

    // constructeur
    public Etudiant(String nom, List<Matière> matières) {
        this.nom = nom;
        this.matières = matières;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public List<Matière> getMatières() {
        return matières;
    }

    //Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatières(List<Matière> matières) {
        this.matières = matières;
    }

    // ToString Method
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", matières=" + matières +
                '}';
    }
    public String toTableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("| %-20s |", nom));
        for (Matière matière : matières) {
            sb.append("\n|                      | ").append(matière.toString());
        }
        return sb.toString();
    }
}
