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

4. Beim erzeugen des Threads soll die Wartezeit und der name festgelegt sein. -> Konstruktor mit Übernahmeparameter
    ````java
    public class MeinThread extends Thread {

        //objektvariablen
        String name;
        int time;

        //Konstruktor
        public MeinThread(String name, int pWait){
            this.name = name;
            pWait = time;
        }
    }
    ````

5. Jeder Thread hat einen Namen und eine wartezeit in ms und zählt von 1-100. Der Thread gibt diesen Wert nachddem er gestartet wurde 
nebenläufig auf der Konsole aus.
Erweitern Sie die Thread Klasse und testen Sie 2 Threads mit 30 und 100 ms wartezeit. 
    ````java
    public class MeinThread extends Thread {

        [...]
        //run Methode überschrieben
        @Override
        public void run() {

            for (int i = 0; i <= 100; i++) {
                System.out.println("Name: " + name + " " + i);
            
                try {
                    Thread.sleep(time);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public class ErzeugeThread {

        public static void main(String[] args){

            MeinThread a = new MeinThread("a", 100);
            MeinThread b = new MeinThread("b", 30);

            a.start();
            b.start();
            
        }
    }
    ````

6. Zeigen Sie das der main-Thread von den Zähltreads zuende ist, obwohl er zuerst gestartet wurde.
    ````java
    public class ErzeugeThread {

        public static void main(String[] args){

            System.out.println("Main gestartet");

            MeinThread a = new MeinThread("a", 100);
            MeinThread b = new MeinThread("b", 30);

            a.start();
            b.start();

            System.out.println("Main zuende");
            
        }
    }
    ````