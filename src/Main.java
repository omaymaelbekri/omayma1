import services.GestionDesNotesImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionDesNotesImpl gestionDesNotes = new GestionDesNotesImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choisissez une opération:");
            System.out.println("1. Initialiser les étudiants et les notes");
            System.out.println("2. Ajouter des notes pour un étudiant");
            System.out.println("3. Récupérer la liste des étudiants");
            System.out.println("4. Calculer la moyenne");
            System.out.println("5. Quitter");
            System.out.print("Votre choix:  ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // consommer le reste de la ligne

            switch (choix) {
                case 1:
                    gestionDesNotes.demanderNomEtInitialiser();
                    break;
                case 2:
                    gestionDesNotes.saisirNotes();
                    break;
                case 3:
                    System.out.println(gestionDesNotes.recupererEtudiants());
                    break;
                case 4:
                    gestionDesNotes.calculerMoyenne();
                    break;
                case 5:
                    gestionDesNotes.quitter();
                    break;
                default:
                    System.out.println("Choix invalide. Réessayez.");
            }
        }
    }
}