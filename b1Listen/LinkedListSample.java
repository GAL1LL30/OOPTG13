package b1Listen;

import java.util.LinkedList;

public class LinkedListSample {

    public static void main(String[] args) {
        
        //Konsole löschen
        System.out.print("\033[H\033[23");
        System.out.flush();

        //LinkedList erzeugen
        LinkedList<String> einkaufsliste = new LinkedList<>();

        //Wete hinzufügen
        einkaufsliste.add("Tomaten");
        einkaufsliste.add("Milch");
        einkaufsliste.add("Käse");
        einkaufsliste.add("Salami");
        einkaufsliste.add("Toilettenpapier");

        //Ausgabe
        System.out.println("Ausgabe mit Syso");
        System.out.println(einkaufsliste);
        System.out.println("----------------------");

        //entfernen von Objekten
        System.out.println("entfernt Element mit index 3");
        einkaufsliste.remove(3);
        System.out.println("----------------------");
        
        //Interiernen über Listen
        System.out.println("Interiert über ganze Liste");
        for (String s : einkaufsliste) {
            System.out.println(s);
        }
        System.out.println("----------------------");

        //Liste als Queue(Stack,Stapel)
        System.out.println("Stapeloptionen");
        einkaufsliste.removeFirst();
        einkaufsliste.removeLast();
        einkaufsliste.addFirst("Wasser");
        einkaufsliste.addLast("Bier");
        System.out.println("----------------------");

        System.out.println(einkaufsliste);

        //syso mit pop -> erstes wird einzeln ausgegeben und dann aus der Liste entfernt
        System.out.println("einkaufsliste.pop()");
        System.out.println(einkaufsliste.pop());
        System.out.println(einkaufsliste);
        System.out.println("----------------------");

        //syso mit pollLast -> letztes wird einzeln ausgegeben und dann aus der Liste entfernt
        System.out.println("einkaufsliste.pollLast()");
        System.out.println(einkaufsliste.pollLast());
        System.out.println(einkaufsliste);
        System.out.println("----------------------");

        //betsimmte Werte aus Liste holen
        String ware = einkaufsliste.get(0);
        System.out.println(ware);
    }
}
