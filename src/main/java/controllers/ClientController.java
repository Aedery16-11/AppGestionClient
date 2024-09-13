package controllers;

import services.ClientService;

import java.util.Scanner;

public class ClientController {
    private ClientService service;
    private Scanner scanner;

    public ClientController(ClientService service, Scanner scanner) {
        this.service = service;
        this.scanner = scanner;
    }
}
