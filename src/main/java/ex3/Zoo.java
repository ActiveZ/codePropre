package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private List<Animal> animaux = new ArrayList<>();

    public Zoo(String nom) {
        this.nom = nom;
    }

    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    public double calculerKgsNourritureParJour(Zone zone) {
        int nbAnimaux = 0;
        for (Animal a : animaux) {
            if (a.getZone().equals(zone)) nbAnimaux++;
        }
        return nbAnimaux * zone.getNourriture();
    }

    public void afficherListeAnimaux(Zone zone) {
        for (Animal a : animaux) {
            if (a.getZone().name().equals(zone.name())) {
                System.out.println(a.getNom());
            }
        }
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
