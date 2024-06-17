package arnaud;

public class Voiture {
    private String marque;
    private float prix;

    public Voiture(String marque, float prix){
        this.marque = marque;
        this.prix   = prix;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }
}