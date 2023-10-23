# Listen in Java

## Array
- ein Array ist eine Liste von Werten/Objekten mit einer festen Anzahl
- alle Wete und Objekte liegen im Speicher beieinander -> kann schnell durchlaufen werden.
- es ist nur ein datentyp erlaubt.

>Codebeispiel:

## ArrayList
- eine ArrayList ist eine Dynamische liste von werten und Objekten
- Intern wird die ArrayLis mit einem Array abgebildet, welches immer genug freie Plätze vorhält, dass heißt es wird intern eine neue Array-Struktur aufgebaut, wenn dei bestehende Liste bis zu einem bestimmten Schwellenwertgefüllt ist.
-> eine ArryList ist ähnlich schnell im Zugriff wie ein Array.
- eine Arraylist ist keine Queue und kein Stack.

### Codebeispiel
````java
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
````

## Linked List
- Die LinkedList ist eine doppelt verkettete Liste. D.h. jedes Element kennt seine Vorgänger und Nachfolger.
- Über den namen der LinkedList greift man mit einem Zeiger auf das erste Element der Liste zu. das letzte Element der Liste enthält den Wert `null`.

### Vorteile 
-  es können beliebig viele Elemente hinzugefügt und wieder entfernt werden
- eine linkedList kann auch als Stapel verwendet werden(Sie ist es nicht)

### Nachteile
- langsame Interation (z.B. beim sortieren)

### Codebeispiel
````java
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
````
### Ausgabe
````bash
[Tomaten, Milch, Käse, Salami, Toilettenpapier]
LinkedListSample 
----------------------
entfernt Element mit index 3
----------------------
usgabe mit Sysoganze Liste
[Tomaten, Milch, Käse, Salami, Toilettenpapier]
----------------------
entfernt Element mit index 3
----------------------
Interiert über ganze Liste
Tomatenptionen
Milch
-----------------
[Käseser, Milch, Käse, Bier]
----------------------
Stapeloptionen
----------------------
[Wasser, Milch, Käse, Bier]
einkaufsliste.pop()
Wasser
[Milch, Käse, Bier]
----------------------
einkaufsliste.pollLast()
Bier
[Milch, Käse]
----------------------
````