/**
 * ErzeugeThread
 */
public class ErzeugeThread {

    public static void main(String[] args){

        System.out.println("Main gestartet");

        MeinThread a = new MeinThread("a", 100);
        MeinThread b = new MeinThread("b", 30);

        a.run();
        b.run();

        System.out.println("Main zuende");
    }
}