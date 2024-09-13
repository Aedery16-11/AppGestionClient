package controllers;

import services.ComptableService;

import java.sql.SQLException;
import java.util.Scanner;

public class ComptableController {
    private ComptableService service;
    private Scanner scanner;
    public ComptableController() {
        this.service = new ComptableService();
        this.scanner = new Scanner(System.in);
    }
    public void createComptable() throws SQLException {
        System.out.println("Créer un comptable");
        System.out.println("Entrez le nom du comptable");
        String nom = scanner.nextLine();
        System.out.println("Entrez l'email du comptable");
        String email = scanner.nextLine();
        System.out.println("Entrez le numéro de téléphone du comptable");
        String tel = scanner.nextLine();
        service.create(nom, email, tel);
    }
}
