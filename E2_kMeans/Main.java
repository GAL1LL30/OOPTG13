package E2_kMeans;

import java.util.ArrayList;
import java.util.List;



public class Main {

    static double delta = 0;
    static ArrayList<Mydata> o = new ArrayList<Mydata>();
    static ArrayList<Entfernung> ag = new ArrayList<Entfernung>();
    static ArrayList<Entfernung> ar = new ArrayList<Entfernung>();
    static ArrayList<Entfernung> ab = new ArrayList<Entfernung>();
    
    public static void main(String[] args) {
        initData();
        do{
            berechneAbstand();
            ordneZentrumZu();
            berechneNeuesZentrum();
            setzeNeuesZentrum();
        }while(delta>0);
    }
    private static void berechneAbstand() {
        for(Mydata i : o){

        }
    }
    private static void ordneZentrumZu() {

    } 

    private static void berechneNeuesZentrum() {

    }
    
    private static void setzeNeuesZentrum() {

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

            o.add(new Mydata(5, "gruen"));
            o.add(new Mydata(10, "rot"));
            o.add(new Mydata(15, "blau"));
        }
    }

