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

