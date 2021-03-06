public class Maillon implements Comparable{
    private Couple i;
    private int ligne;
    private int colonne;
    private Maillon suiv;


    /*
    public Maillon(Couple i){
        this.i = i;
        suiv = null;
    }
    */
    public Maillon(int ligne, int colonne){
        this.ligne = ligne;
        this.colonne = colonne;
        suiv = null;
    }


    public Couple getInfo(){
        return i;
    }

    public int getLigne(){
        return ligne;
    }

    public int getColonne(){
        return colonne;
    }

    public void setSuivant(Maillon i){
        this.suiv = i;
    }

    public int compareTo(Object o){
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) return -1;
        Maillon other = (Maillon) o;
        if(other.getLigne() < this.ligne)return 1;
        if(ligne == other.getLigne()) {
            if (other.getColonne() < colonne)
                return 1;
            else
                return (other.getColonne() == colonne ? 0 : -1);
        }
        return -1;
    }

    public Maillon getSuiv() {
        return suiv;
    }

    @Override
    public String toString(){
        return "("+this.ligne+","+this.colonne+")";
    }
}
