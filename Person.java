public class Person {
    
    private String name;

    // initialize field name using constructor
    public Person(String name){
        this.name = name;
    }

    // Override toString method
    @Override
    public String toString(){
        return this.name;
    }

    // Getter and setters
    // Getter
    public String getName(){
        return this.name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
}
