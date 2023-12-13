package classes;

import java.util.List;

public class Matière {
    private String nom;
    private List<Double> notes;

    // Constructeur
    public Matière(String nom, List<Double> notes) {
        this.nom = nom;
        this.notes = notes;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Setters
    public List<Double> getNotes() {
        return notes;
    }

    public void setNotes(List<Double> notes) {
        this.notes = notes;
    }

    // ToString Methodee
    @Override
    public String toString() {
        return "Matière{" +
                "nom='" + nom + '\'' +
                ", notes=" + notes +
                '}';
    }
}
