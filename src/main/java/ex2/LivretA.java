package ex2;

public class LivretA extends CompteBancaire {
    /**
     *
     * @param type
     * @param solde
     * @param tauxRemuneration représente le taux de rémunération du livret A
     */
    public LivretA(String type, double solde, double tauxRemuneration) {
        super(type, solde, 0, tauxRemuneration);
    }

    @Override
    public void debiterMontant(double montant) {
        if (montant > getSolde()) {
            System.out.println("Opération annulée: solde insuffisant");
            return;
        }
        super.debiterMontant(montant);
    }

    public void appliquerRemuAnnuelle() {
            this.setSolde(getSolde() + getSolde() * getTauxRemuneration() / 100);
    }
}
