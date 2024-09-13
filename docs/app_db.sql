CREATE TABLE comptables (
                            comptable_id INT PRIMARY KEY AUTO_INCREMENT,
                            nom VARCHAR(255) NOT NULL,
                            email VARCHAR(255),
                            telephone VARCHAR(20)
);

CREATE TABLE clients (
                         client_id INT PRIMARY KEY AUTO_INCREMENT,
                         raison_sociale VARCHAR(255) NOT NULL,
                         siret VARCHAR(14) NOT NULL UNIQUE,
                         comptable_id INT,
                         FOREIGN KEY (comptable_id) REFERENCES comptables(comptable_id)
);

