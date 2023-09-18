/**
 * ErzeugeThread
 */
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