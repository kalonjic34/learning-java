package game.objects;

public class GameObject implements Comparable<GameObject>{
    private int id;
    private String name;

    private int[][] comparison = {
            //              rock    paper   scissors
            
            /* rock */        {0,       -1,       1,},
            /* paper*/        {1,        0,      -1,},
            /* scissors*/     {-1,       1,       0,},
             
    };

    protected int getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(GameObject other){
        return comparison[id][other.id];
    }

}