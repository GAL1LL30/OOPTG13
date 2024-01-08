package E2_kMeans;

public class MyCenter {

    String name;
    double x;

    public MyCenter(double x, String name){
        this.name = name;
        this.x = x;
    }

    public double getX(){
        return x;
    }

    public String getName(){
        return name;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cluster Name: '" + name + "',\nx: " + x ;
    }
}