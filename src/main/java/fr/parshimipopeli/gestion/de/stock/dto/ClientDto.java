package fr.parshimipopeli.gestion.de.stock.dto;

import fr.parshimipopeli.gestion.de.stock.entity.Adresse;

public class ClientDto {
    private String nom;

    private String prenom;

    private Adresse adresse;

    private String email;

    private String telephone;


    public ClientDto(String nom, String prenom, String email, Adresse adresse, String telephone) {
    }
}
