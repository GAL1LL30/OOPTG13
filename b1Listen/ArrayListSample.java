package b1Listen;

import java.util.ArrayList;

public class ArrayListSample{
    public static void main(String[] args) {
        
        //ArrayListe erstellen
        ArrayList<String> namen = new ArrayList<>();

        //Objekte hinzufügen
        namen.add("Elias");
        namen.add("Lennard");
        namen.add("Niklas");

        //Liste ausgeben
        System.out.println(namen);

        //Objekt entfernen
        namen.remove(1);

        //Über Liste interagieren
        for (String i : namen) {
            System.out.println(i);
        }

        //prüfen ob Werte in der Liste sind
        System.out.println(namen.contains("Niklas"));
    }
}