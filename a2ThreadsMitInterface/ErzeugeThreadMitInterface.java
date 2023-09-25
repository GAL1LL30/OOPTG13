package a2ThreadsMitInterface;

/**
 * ErzeugeThreadMitInterface
 */
public class ErzeugeThreadMitInterface {

    public static void main(String[] args) {
        System.out.println("Main-Thread mit Interface gestartet");

        MeinThread a = new MeinThread("a", 100);
        MeinThread b = new MeinThread("b", 30);

        a.start();
        b.start();

        System.out.println("Main-Thread mit Interface zuende");
    }
}
