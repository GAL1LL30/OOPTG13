package E2_kMeans;

public class Mydata {
    
    int schueler, anzKlassen;
    double center;
    String name;

    public Mydata(int schueler, int anzKlassen){
        this.anzKlassen = anzKlassen;
        this.schueler = schueler;
    }

    public int getAnzKlassen(){
        return anzKlassen;
    }

    public double getSchueler(){
        return schueler;
    }

    public double getCenter(){
        return center;
    }

    public void setCenter(double center){
        this.center = center;
    }

    @Override
    public String toString() {
        return "Schueler Nr. " + schueler + ",hat " + anzKlassen + "Klassen verwendet.";
    }


}
