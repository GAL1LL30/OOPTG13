/**
 * MeinThread
 */
public class MeinThread extends Thread {

    //objektvariablen
    String name;
    int time;

    //Konstruktor
    public MeinThread(String name, int pWait){
        this.name = name;
        pWait = time;
    }

    //run Methode überschrieben
    @Override
    public void run() {

        System.out.println("Name " + name + " gestartet");

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