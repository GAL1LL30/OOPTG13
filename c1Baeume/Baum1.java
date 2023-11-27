package c1Baeume;

public class Baum1 {

    static Node root;

    public Baum1() {
        root = null;
    }

    public void insert(int value) {
        if (root == null) 
        {
            root = new Node(value, null);
        } 
        else 
        {
            insert(root, value);
        }
    }

    private void insert(Node parent, int value) {
        if (parent.wert > value) 
        {
            if (parent.links == null) 
            {
                parent.links = new Node(value, parent);
            } 
            else 
            {
                insert(parent.links, value);
            }
        } 
        else 
        {
            if (parent.rechts == null) 
            {
                parent.rechts = new Node(value, parent);
            } 
            else 
            {
                insert(parent.rechts, value);
            }
        }
    }

    public int hoehe(){
        int l = 0;
        int r = 0;

        if (root.links != null) 
        {
            l = hoehe(root.links)+1;
        }
        if (root.rechts != null) 
        {
            l = hoehe(root.rechts)+1;
        }
        return Math.max(l, r);
    }

        private int hoehe(Node parent){
        int l = 0;
        int r = 0;

        if (parent.links != null) 
        {
            l = hoehe(parent.links)+1;
        }
        if (parent.rechts != null) 
        {
            r =  hoehe(parent.rechts)+1;
        }

        return Math.max(l, r);
    }

    public int anzahl() {
        if (root == null) 
        {
            return 0;
        } 
        else 
        {
            return 1 + anzahl(root.links) + anzahl(root.rechts);
        }
    }

    private int anzahl(Node parent) {
        if (parent == null) 
        {
            return 0;
        } 
        else 
        {
            return 1 + anzahl(parent.links) + anzahl(parent.rechts);
        }
    }
}