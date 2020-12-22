import java.util.ArrayList;

public class Opskrift {



    String navn;
    String fremgangsmaade;
    int antalPortioner;
    double tilberedningstid;
    //String ingredienser;

    private ArrayList<Ingrediens> ingredienser = new ArrayList<>();




    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFremgangsmaade() {
        return fremgangsmaade;
    }

    public void setFremgangsmaade(String fremgangsmaade) {
        this.fremgangsmaade = fremgangsmaade;
    }

    public int getAntalPortioner() {
        return antalPortioner;
    }

    public void setAntalPortioner(int antalPortioner) {
        this.antalPortioner = antalPortioner;
    }

    public double getTilberedningstid() {
        return tilberedningstid;
    }

    public void setTilberedningstid(double tilberedningstid) {
        this.tilberedningstid = tilberedningstid;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(String ingredienser) {
        this.ingredienser = ingredienser;
    }

    public Opskrift(){
    System.out.println("Opskrift er oprettet:" + getNavn());
        System.out.println("Ingrediens er oprettet;" + getIngredienser());
        System.out.println("Ingrediens er oprettet;" + getIngredienser());
    }


}
