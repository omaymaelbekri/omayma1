package services;

import classes.Etudiant;
import classes.Matière;
import interfaces.GestionDesNotes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionDesNotesImpl implements GestionDesNotes {
    private List<Etudiant> etudiants;
    private Scanner scanner;

    public GestionDesNotesImpl() {
        etudiants = new ArrayList<>();
        scanner = new Scanner(System.in);
    }


    @Override
    public List<Etudiant> recupererEtudiants() {
        return etudiants;
    }

    @Override
    public void demanderNomEtInitialiser() {
        System.out.println("Entrez le nom de l'étudiant:");
        String nom = scanner.nextLine();
        etudiants.add(new Etudiant(nom, new ArrayList<>()));
    }

    @Override
    public void saisirNotes() {
        System.out.println("Entrez le nom de l'étudiant pour lequel vous voulez saisir les notes:");
        String nom = scanner.nextLine();
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equals(nom)) {
                System.out.println("Entrez le nom de la matière:");
                String nomMatière = scanner.nextLine();
                System.out.println("Entrez la note:");
                double note = scanner.nextDouble();
                scanner.nextLine();
                if (note < 0 || note > 20) {
                    System.out.println("Note invalide. Réessayez.");
                    return;
                }
                etudiant.getMatières().add(new Matière(nomMatière, List.of(note)));
                return;
            }
        }
        System.out.println("Étudiant non trouvé.");
    }

    @Override
    public void calculerMoyenne() {
        System.out.println("Entrez le nom de l'étudiant pour lequel vous voulez calculer la moyenne:");
        String nom = scanner.nextLine();
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equals(nom)) {
                double somme = 0;
                int nombreDeNotes = 0;
                for (Matière matière : etudiant.getMatières()) {
                    for (double note : matière.getNotes()) {
                        somme += note;
                        nombreDeNotes++;
                    }
                }
                if (nombreDeNotes == 0) {
                    System.out.println("Aucune note pour cet étudiant.");
                    return;
                }
                double moyenne = somme / nombreDeNotes;
                System.out.println("La moyenne de l'étudiant est: " + moyenne);
                return;
            }
        }
        System.out.println("Étudiant non trouvé.");
    }
    @Override
    public void quitter() {
        System.out.println("Quitting the application...");
        System.exit(0);
    }

}