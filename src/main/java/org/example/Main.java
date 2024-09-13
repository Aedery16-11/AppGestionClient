package org.example;

import controllers.ComptableController;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        displayMainMenu();
    }

    public static void displayMainMenu() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 : questions comptables. 2 : questions clients. 0 : Quitter");

        while (true)
        {
            System.out.println("Gestion clients");
            System.out.println("1. Gestion Comptables");
            System.out.println("2. Gestion Clients");
            System.out.println("0. Quitter");
            System.out.println("Entrez votre choix");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    displayComptableMenu(); break;
                case 2:
                    System.out.println("display clients"); break;
                case 0:
                    System.exit(0); break;
                default:
                    System.out.println("Choix invalide ! "); break;
            }

        }



//        String choice = scanner.nextLine();
//
//        if (choice == "0")
//        {
//            System.exit(0);
//        } else if (choice == "1")
//        {
//            System.out.println("Quelles sont vos compétences en comptabilité ?");
//        }
//        else
//        {
//            System.out.println("Que voulez-vous ?");
//        }
    }

    public static void displayComptableMenu() throws SQLException {
        ComptableController comptableController = new ComptableController();


        System.out.println("1 : questions comptables. 2 : questions clients. 0 : Quitter");

        while (true)
        {
            System.out.println("Gestion clients");
            System.out.println("1. Créer comptable");
            System.out.println("2. Modifier comptable");
            System.out.println("3. Supprimer comptable");
            System.out.println("4. Voir comptable");
            System.out.println("5. Lister comptable");
            System.out.println("0. Quitter");
            System.out.println("Entrez votre choix");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    comptableController.createComptable(); break;
                case 2:
                    System.out.println("update comptable"); break;
                case 3:
                    System.out.println("delete comptable"); break;
                case 4:
                    System.out.println("see comptable"); break;
                case 5:
                    System.out.println("list comptable"); break;

                case 0:
                    displayMainMenu(); break;
                default:
                    System.out.println("Choix invalide ! "); break;
            }

        }
    }

}