package E2_kMeans;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        initData();
    }

    private static void initData() {
        ArrayList<Mydata> o = new ArrayList<Mydata>(); 
            o.add(new Mydata(11, 3));
            o.add(new Mydata(2, 9));
            o.add(new Mydata(9, 5));
            o.add(new Mydata(5, 6));
            o.add(new Mydata(9, 12));
            o.add(new Mydata(9, 2));
            o.add(new Mydata(14, 7));
            o.add(new Mydata(2, 3));
            o.add(new Mydata(1, 5));
            o.add(new Mydata(13, 5));
        }
    }

