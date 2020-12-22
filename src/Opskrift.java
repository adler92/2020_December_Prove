import java.util.ArrayList;

public class Opskrift {



    String navn;
    String fremgangsmaade;
    int antalPortioner;
    int tilberedningstid;
    //String ingredienser;

    private ArrayList<Ingrediens> ingredienser = new ArrayList<>();
    //ingredienser.add(addIngredienser);


    public void addIngrediens(Ingrediens ingrediens){
        addIngrediens("Glasur",1);
        addIngrediens("flormelis", 1);
        addIngrediens("Vand",1);
    }

    public void addIngrediens(String navn, int kalorier){

    }

    public void visIngrediens(){

    }


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

    public void setTilberedningstid(int tilberedningstid) {
        this.tilberedningstid = tilberedningstid;
    }

    public ArrayList<Ingrediens> getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(ArrayList<Ingrediens> ingredienser) {
        this.ingredienser = ingredienser;
    }

    public Opskrift(String navn, String fremgangsmaade, int antalportioner, int tilberedningstid){

    }

    public Opskrift(){

    }

    public void visFremgangsmaade(){

    }


}
