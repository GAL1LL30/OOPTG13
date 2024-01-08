package E2_kMeans;

import java.util.ArrayList;
import java.util.List;



public class Main {

    static double delta = 0;
    static ArrayList<Mydata> o = new ArrayList<Mydata>();
    static ArrayList<MyCenter> c = new ArrayList<MyCenter>();
    static ArrayList<Entfernung> ag = new ArrayList<Entfernung>();
    static ArrayList<Entfernung> ar = new ArrayList<Entfernung>();
    static ArrayList<Entfernung> ab = new ArrayList<Entfernung>();
    
    public static void main(String[] args) {
        initData();
        initCeter();
        do{
            berechneAbstand();
            ordneZentrumZu();
            berechneNeuesZentrum();
            setzeNeuesZentrum();
        }while(delta>0);
    }
    
    private static void berechneAbstand() {
        
        for(MyCenter i : c){
            for(Mydata j : o){
                double x1,x2,Abstand;
                
                x1 = j.getAnzKlassen();
                x2 = i.getX();

                Abstand = Math.abs(x1 - x2);

                if(i.getX() == 5){
                    ag.add(new Entfernung(Abstand));
                }
                else if(i.getX() == 10){
                    ar.add(new Entfernung(Abstand));
                }
                else if(i.getX() == 15){
                    ab.add(new Entfernung(Abstand));
                }
            }
        }
            
    }
    private static void ordneZentrumZu() {
        for(Mydata i : o){
            if(ag.get(i.getAnzKlassen()) < ar.get(i.getAnzKlassen()) && ag.get(i.getAnzKlassen()) < ab.get(i.getAnzKlassen())){
                i.setCenter(c.get(0).getX());
            }
            else if (ar.get(i.getAnzKlassen()) < ag.get(i.getAnzKlassen()) && ar.get(i.getAnzKlassen()) < ab.get(i.getAnzKlassen())){
                i.setCenter(c.get(1).getX());
            }
            else if (ab.get(i.getAnzKlassen()) < ar.get(i.getAnzKlassen()) && ab.get(i.getAnzKlassen()) < ag.get(i.getAnzKlassen())){
                i.setCenter(c.get(2).getX());
            }
        }
    } 
    private static void berechneNeuesZentrum() {
        int anzGr = 0, anzRt = 0, anzBl = 0;
        int gesGr = 0, gesRt = 0, gesBl = 0;
        
        for(Mydata i : o){
            if(i.getCenter() == c.get(0).getX()){
                anzGr ++;
                gesGr = gesGr + i.getAnzKlassen();
            }
            else if(i.getCenter() == c.get(1).getX()){
                anzRt ++;
                gesRt = gesRt + i.getAnzKlassen();
            }
            else if(i.getCenter() == c.get(2).getX()){
                anzBl ++;
                gesBl = gesBl + i.getAnzKlassen();
            }
        }
        
    }
    
    private static void setzeNeuesZentrum() {

    }
    

    private static void initCeter() {
        c.add(new MyCenter(5, "gruen"));
        c.add(new MyCenter(10, "rot"));
        c.add(new MyCenter(15, "blau"));
    }

    private static void initData() { 

            o.add(new Mydata(1, 9));
            o.add(new Mydata(2,4));
            o.add(new Mydata(3, 13));
            o.add(new Mydata(4, 13));
            o.add(new Mydata(5, 10));
            o.add(new Mydata(6, 2));
            o.add(new Mydata(7, 10));
            o.add(new Mydata(8, 5));
            o.add(new Mydata(9, 4));
            o.add(new Mydata(10, 7));
            o.add(new Mydata(11, 8));
            o.add(new Mydata(12, 12));
            o.add(new Mydata(13, 16));
            o.add(new Mydata(14, 4));
            o.add(new Mydata(15, 8));
            o.add(new Mydata(16, 4));
            o.add(new Mydata(17, 10));
            o.add(new Mydata(18, 13));
            o.add(new Mydata(19, 8));
            o.add(new Mydata(20, 5));
        }
    }

