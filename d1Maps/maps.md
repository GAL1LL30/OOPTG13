# Maps

## Grundlegendes
- enthält Objekte in einer strukturierten Form
- Map-Klassen müssen das Interface "java.util.Map" implementierer
- Jeder Eintarag in der Map besthet aus einem Schlüssel und einem Wert
- Jeder Schlüssel muss einzigartig sein
- Wenn ein Schlüssel bereits vergeben ist, wird der Wert überschrieben

## Map bearbeitung

- `name.put(key,value)` -> Ein Element wird an mit dem Key hinzugefügt + gibt Wert aus wenn Schlüssel bereits in der Map vorhanden ist, sonst null
- `name.remove (Object key)` -> Keys wird gelöscht + Wert des gelöschten Keys wird ausgegeben
- `name.values()` -> gibt alle Werte der Map aus
- `name.keySet()` -> gibt alle Schlüssel der Map aus
- `name.get(Object key)` -> ermittelt Wert zu Key
- `name.isEmpty()` -> prüft ob die Map leer ist
- `name.clear()` -> entfernt alle Einträge aus der Map
- `name.size()` -> gibt die Anzahl an vorhandenen Werten zurück



## Beispiel

````java
public class Student
{
    // Attribute name und vorname eines Studenten
    String name,vorname;
    // Attribut matrikelnummer (eindeutige Nummer)
    int matrikelnummer;
    // Konstruktor für einen Studenten
    public Student(String name,String vorname,int matrikelnummer)
    {
        this.name = name;
        this.vorname = vorname;
        this.matrikelnummer = matrikelnummer;
    }
    // getter-Methode für die Matrikelnummer
    public int getMatrikelnummer()
    {
        return this.matrikelnummer;
    }
}
 
// Import-Anweisung für unsere HashMap
import java.util.HashMap;
 
public class HashMapTest
{
    // main-Methode
    public static void main(String[] args)
    {
        HashMap map = new HashMap();

        // Drei Objekte der Klasse Student werden erzeugt
        Student st1 = new Student("Topf", "Hans", 12345);
        Student st2 = new Student("Teller", "Hannes", 12323);
        Student st3 = new Student("Besteck", "Maxi", 12345);

        // Einfügen der Objekte in die HashMap
        // Matrikelnummer wird als Key eingetragen 
        map.put(new Integer(st1.getMatrikelnummer()), st1);
        map.put(new Integer(st2.getMatrikelnummer()), st2);

        // Student st1 wird durch st3 ersetzt, da die 
        // Matrikelnummer schon als Schlüssel vergeben ist
        map.put(new Integer(st3.getMatrikelnummer()), st3);
    }
}
````





http://www.scalingbits.com/java/javakurs2/programmieren2/collection/maps