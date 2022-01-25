package ex3;

public enum Zone {
    AQUARIUM(0.2, "Aquarium"),
    FERME_REPTILE(0.1, "Ferme reptiles"),
    SAVANE_AFRICAINE(10.0, "Savane Africaine"),
    ZONE_CARNIVORE(10.0, "Zone carnivore");
    private double nourriture;
    private String libelle;

    Zone(double nourriture, String libelle) {
        this.nourriture = nourriture;
        this.libelle = libelle;
    }

    public double getNourriture() {
        return nourriture;
    }

    public String getLibelle() {
        return libelle;
    }
}
