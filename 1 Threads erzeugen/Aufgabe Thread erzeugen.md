# Thread erzeugen

## Aufgabe
1. Erzeugen Sie die java dtaeien `ErzeugeThread.java` und `MeinThread.java`.
2. Fügen Sie eine Main-Methode in die Klasse `ErzeugeThread` ein.
````java
public class ErzeugeThread {

    public static void main(String[] args){
        
    }
}
````
3. Die Klasse `MeinThread` soll von der Klasse `Thread` erben.
````java
public class MeinThread extends Thread {

    
}
````
4. Jeder Thread hat einen Namen und eine wartezeit in ms und zählt von 1-100. Der Thread gibt diesen Wert nachddem er gestartet wurde 
nebenläufig auf der Konsole aus. 
Erweitern Sie die Thread Klasse und testen Sie 2 Threads mit 30 und 100 ms wartezeit.
5. Beim erzeugen des Threads soll die Wartezeit und der name festgelegt sein. -> Konstruktor mit Übernahmeparameter 
6. 