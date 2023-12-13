package interfaces;

import classes.Etudiant;

import java.util.List;

public interface GestionDesNotes {
    void demanderNomEtInitialiser();
    void saisirNotes();
    List<Etudiant> recupererEtudiants();
    void calculerMoyenne();
    void quitter();
}