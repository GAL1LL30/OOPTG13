package E2_kMeans;

public class MyCenter {

    String name;
    double x,y;

    public MyCenter(double x, double y, String name){
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String getName(){
        return name;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cluster Name: '" + name + "',\nx: " + x + "\n,y: " + y;
    }
}