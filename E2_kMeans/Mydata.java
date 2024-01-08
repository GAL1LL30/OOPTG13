package E2_kMeans;

public class Mydata {
    
    int schueler, anzKlassen;
    double c;
    String name;

    public Mydata(int schueler, int anzKlassen){
        this.anzKlassen = anzKlassen;
        this.schueler = schueler;
    }

    public Mydata(double center, String name){
        this.c = center;
        this.name = name;
    }

    public double getAnzKlassen(){
        return anzKlassen;
    }

    public double getSchueler(){
        return schueler;
    }

    public double getCenter(){
        return c;
    }

    public void setCenter(double c){
        this.c = c;
    }

    @Override
    public String toString() {
        return "Schueler Nr. " + schueler + ",hat " + anzKlassen + "Klassen verwendet.";
    }


}
