# Array
- Feste Größe
- Kann schnell durchlaufen/durchsucht werden
- Kann mehrere Dimensionen haben
### Codebeispiel:
````java
int[] lotto = new int[6];

//Ziehen der Lottozahlen
…
//Speichern der Lottozahlen
lotto[0]=5;
lotto[1]=15;
lotto[2]=25;
lotto[3]=26;
lotto[4]=30;
lotto[5]=31;

//Werte ändern / löschen des 3. Wertes
lotto[2]=0;
		
//Ausgabe
for(int i = 0; i<lotto.length; i++){
	System.out.println(lotto[i]);
}
````
### Pseudocode Beispiel ForEach-Schleife:
````phyt
FÜR alle i in lotto
    WENN i=5
		AUSGABE "5 ist in Lottozahlen ethalten"
	ENDE WENN
ENDE FÜR
````

# ArrayList
- java.util.List muss implementiert werden
- ist immer ein dimensional
- Eine ArrayList vergrößert sich immer so, dass genügend Plätze für neue Daten vorhanden sind -> es wird wenn nötig ein neuses Arry gebaut und die alten Daten werden übertragen
### Codebeispiel:
````java
//ArrayList erstellen
ArrayList<integer> primzahlen = new ArrayList<>();

//Objekte hinzufügen
primzahlen.add(2);
primzahlen.add(3);
primzahlen.add(4);

//Liste ausgeben
System.ot.println(primzahlen);

//Objekte entfernen
primzahlen.remove(1);

//Über Liste iterieren
for(Integer i : primzahlen){
	System.out.println(i);
}

//prüfen ob Werte in liste sind -> Rückgabewert = boolscher Wert
System.out.println(primzahlen.contains(5));

//Wert aus Liste holen
Integer i1 = primzahlen.get(0);
````
# LinkedList
- verkettete Liste
- jeder Wert kennt seinen Nachfolger und seinen Nachfolger
### Vorteile
- es könen belibig viele Elemente hinzugefügt oder entfernt werden
- eine LinkedList kann auch als Speicher verwendet werden
### Nachteile
- langsame Iteration (z.B. beim sortieren)
### CodeBeispiel
````java
//LinkedList erzeugen
LinkedList<String> programmiersprachen = new LinkedList<>();

//Objekte hinzufügen
programmiersprache.add("c");
programmiersprache.add("java");
programmiersprache.add("c++");

//Liste ausgeben
System.ot.println(programmiersprache);

//Objekte entfernen
programmiersprache.remove(1);

//Über Liste iterieren
for(String i : programmiersprache){
	System.out.println(i);
}

//prüfen ob Werte in liste sind -> Rückgabewert = boolscher Wert
System.out.println(programmiersprache.contains("c++"));

//Wert aus Liste holen
String i1 = programmiersprache.get(0);

//Listen als Queue (Stack, Stapel)
programmiersprache.removeFirst();
programmiersprache.removeLast();
programmiersprache.addFirst("Basic");
programmiersprache.addLast("VBA");

String test1 = programmiersprache.pollLast();	//Letztes Element wird aus dem Array geholt und in test1 gespeichert

//Ausgabe
System.out.println(programmiersprache);
````