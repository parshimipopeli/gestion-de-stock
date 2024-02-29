package fr.parshimipopeli.gestion.de.stock.dto;


import fr.parshimipopeli.gestion.de.stock.model.Adresse;
import lombok.Builder;
import lombok.Data;

    @Data
    @Builder
    public class AdresseDto {

        private String rue;

        private int numeroRue;

        private String ville;

        private String codePostal;

        private String pays;

        public AdresseDto fromEntity(Adresse adresse) {
            if (adresse == null) {
                return null;
            }

            return AdresseDto.builder()
                    .rue(adresse.getRue())
                    .numeroRue(adresse.getNumeroRue())
                    .codePostal(adresse.getCodePostal())
                    .ville(adresse.getVille())
                    .pays(adresse.getPays())
                    .build();
        }

        public Adresse toEntity(AdresseDto adresseDto) {
            if (adresseDto == null) {
                return null;
            }
            Adresse adresse = new Adresse();
            adresse.setRue(adresseDto.getRue());
            adresse.setNumeroRue(adresseDto.getNumeroRue());
            adresse.setVille(adresseDto.getVille());
            adresse.setCodePostal(adresseDto.getCodePostal());
            adresse.setPays(adresseDto.getPays());
            return  adresse;
        }
    }

