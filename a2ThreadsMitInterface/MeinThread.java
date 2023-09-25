package a2ThreadsMitInterface;

class MeinThread implements Runnable{

    String name;
    int time;
    Thread t;


    public MeinThread(String name, int pWait){
        this.name = name;
        pWait = time;
        t = new Thread(this);
    }

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
    
    public void start(){
        t.start();
    }

}