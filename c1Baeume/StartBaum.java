package c1Baeume;

public class StartBaum {
    public static void main(String[] args) {
        
        Baum1 t1 = new Baum1();
        
        t1.insert(3);
        t1.insert(2);
        t1.insert(7);
        t1.insert(4);

        System.out.println("Binärbaum: ");
        
        int i;
        for(i=0;i<=3;i++){
            System.out.println(t1);
        }

        System.out.println("---------------");

    }

}