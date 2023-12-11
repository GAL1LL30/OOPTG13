package KNearestNeighbour;

import java.util.ArrayList;

public class Main {
    public static int k = 5;

    public static void main(String[] args) {
        ArrayList<DataObjekt> objs = new ArrayList<DataObjekt>();
        objs.add(new DataObjekt(5,1,0));
        objs.add(new DataObjekt(6,1,0));
        objs.add(new DataObjekt(5,2,0));
        objs.add(new DataObjekt(6,2,0));
        objs.add(new DataObjekt(7,1,0));

        objs.add(new DataObjekt(0,4,1));
        objs.add(new DataObjekt(1,4,1));
        objs.add(new DataObjekt(0,5,1));
        objs.add(new DataObjekt(1,5,1));
        DataObjekt o = new DataObjekt(5,5);

        System.out.println("Zugeordenete Klasse: " + kNN(o, objs));
    }

    public static int kNN(DataObjekt o, ArrayList<DataObjekt> objs)
    {
        int[] indices = new int[k];
        double[] mins = new double [k];

        for (int i = 0; i < k; i++) 
        {
            mins[i] = Double.MAX_VALUE;   
        }

        for (int i = 0; i < objs.size(); i++) 
        {
            double dist = distance(o, objs.get(i));
            double max = Double.MIN_VALUE;
            int maxIdx = 0;
            for (int j = 0; j < k; j++) 
            {
                if(max < mins[j])
                {
                    max = mins[j];
                    maxIdx = j;
                }
            }
            if(mins[maxIdx] > dist)
            {
                mins[maxIdx] = dist;
                indices[maxIdx] = i;
            }   
            
        }

        int a = 0;
        int b = 0;
        for (int i = 0; i < k; i++) 
        {
            if(objs.get(indices[i]).klasse == 0)
            {
                a++;
            }
            else
            {
                b++;
            }
        }
        
        if (a > b)
        {
            return 0;    
        }
        else
        {
            return 1;
        }
    }

    public static double distance(DataObjekt o, DataObjekt ref)
    {
        return (o.x - ref.x) * (o.x - ref.x) + (o.y - ref.y) * (o.y - ref.y);
    }

}
