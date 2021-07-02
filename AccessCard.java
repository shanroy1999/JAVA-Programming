// make sure this class implements Comparable interface so that we can define own priority in Queue
public class AccessCard implements Comparable<AccessCard>{
    private String name;
    private int id;

    public AccessCard(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return this.name + "-" + this.id;
    }

    // Override CompareTo method -> crucial to be able to compare AccessCard objects
    @Override
    public int compareTo(AccessCard o) {
        return Integer.compare(this.id, o.getId());
    }
}
