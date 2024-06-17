package arnaud;

import java.util.ArrayList;
import java.util.Collection;

public class Service implements Statistique {
    private ArrayList<Voiture> voitures;

    /**
     * Création d'un service vide
     * @void
     */
    public Service(){
        this.voitures = new ArrayList<>();
    }

    /**
     * Création d'un service avec une voiture
     * @void
     */
    public Service(Voiture voiture){
        this.voitures = new ArrayList<Voiture>();
        this.voitures.add(voiture);
    }

    /**
     * Création d'un service avec une voiture
     * @void
     */
    public Service(ArrayList<Voiture> voitures){
        this.voitures = voitures;
    }

    /**
     * Renvoie la liste des voitures du service
     * @ArrayList<Voiture>
     */
    public ArrayList<Voiture> getVoitures() {
        return voitures;
    }

    /**
     * Permet d'ajouter une voiture à la liste du service
     * @void
     */
    @Override
    public void ajouter(Voiture voiture) {
        this.voitures.add(voiture);
    }

    /**
     * Renvoie le prix total des voitures après réduction
     * @int
     */
    @Override
    public int prix() throws ArithmeticException {
        if (this.voitures.size() != 0) {
            float rst = 0;
            for (int i = 0; i < this.voitures.size(); i++) {
                rst += this.voitures.get(i).getPrix();
            }
            float nb_reduc = this.voitures.size()/5;
            double reduc = rst * nb_reduc * 0.05;
            return ((int) (rst - reduc));
        }
        else {
            throw new ArithmeticException("Il n'y a pas de voitures dans le tableau");
        }
    }
}
