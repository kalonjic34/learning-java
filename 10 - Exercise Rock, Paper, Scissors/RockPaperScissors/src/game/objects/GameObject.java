package game.objects;

public class GameObject {
    private int id;
    private String name;


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
        return "GameObject {" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

    
}