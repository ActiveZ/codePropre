package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Gazelle",Type.MAMMIFERE, Comportement.HERBIVORE, Zone.SAVANE_AFRICAINE));
		zoo.addAnimal(new Animal("Zèbre",Type.MAMMIFERE, Comportement.HERBIVORE,Zone.SAVANE_AFRICAINE));
		zoo.addAnimal(new Animal("Lion", Type.MAMMIFERE,Comportement.HERBIVORE,Zone.ZONE_CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", Type.MAMMIFERE,Comportement.CARNIVORE,Zone.ZONE_CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Type.POISSON,Comportement.CARNIVORE,Zone.AQUARIUM));
		zoo.addAnimal(new Animal("Truite dorée", Type.POISSON,Comportement.HERBIVORE, Zone.AQUARIUM));
		zoo.addAnimal(new Animal("Boa constrictor", Type.SERPENT,Comportement.CARNIVORE, Zone.FERME_REPTILE));
		zoo.addAnimal(new Animal("Python", Type.SERPENT,Comportement.CARNIVORE, Zone.FERME_REPTILE));

		zoo.afficherListeAnimaux(Zone.SAVANE_AFRICAINE);
		zoo.afficherListeAnimaux(Zone.ZONE_CARNIVORE);
		zoo.afficherListeAnimaux(Zone.AQUARIUM);
		zoo.afficherListeAnimaux(Zone.FERME_REPTILE);

		System.out.println("Nourriture pour " + Zone.SAVANE_AFRICAINE.getLibelle() + ": " + zoo.calculerKgsNourritureParJour(Zone.SAVANE_AFRICAINE));
		System.out.println("Nourriture pour " + Zone.ZONE_CARNIVORE.getLibelle() + ": " + zoo.calculerKgsNourritureParJour(Zone.ZONE_CARNIVORE));
		System.out.println("Nourriture pour " + Zone.AQUARIUM.getLibelle() + ": " + zoo.calculerKgsNourritureParJour(Zone.AQUARIUM));
		System.out.println("Nourriture pour " + Zone.FERME_REPTILE.getLibelle() + ": " + zoo.calculerKgsNourritureParJour(Zone.FERME_REPTILE));
	}
}
