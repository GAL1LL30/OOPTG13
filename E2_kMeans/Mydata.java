package E2_kMeans;

public class Mydata {
    
    double x,y;
    double c;

    public Mydata(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getCenter(){
        return c;
    }

    public void setCenter(double c){
        this.c = c;
    }

    @Override
    public String toString() {
        return "Data x=" + x + ",\ny=" + y;
    }


}
