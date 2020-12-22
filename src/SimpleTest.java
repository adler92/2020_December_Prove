public class SimpleTest {

    static Opskrift glasurOpskrift;
    static Opskrift teOpskrift;

    public static Opskrift getGlasurOpskrift() {
        return glasurOpskrift;
    }

    public static void setGlasurOpskrift(Opskrift glasurOpskrift) {
        SimpleTest.glasurOpskrift = glasurOpskrift;
    }

    public static Opskrift getTeOpskrift() {
        return teOpskrift;
    }

    public static void setTeOpskrift(Opskrift teOpskrift) {
        SimpleTest.teOpskrift = teOpskrift;
    }


    public static void main(String[] args) {

        System.out.println("Velkommen til min opskrifts-applikation-dummy\n");

        Opskrift glasurOpskrift = new Opskrift();
        System.out.println(glasurOpskrift);


        Opskrift teOpskrift = new Opskrift();
    }

    //public static opretOpskrifter(){

    //}

    public void blankLine(){
        System.out.println("");
    }


}
