// Again using Inheritance to further extend Child Class

// public class GrandChild extends Child, Parent{}     // Multiple Inheritance Not allowed in Classes
public class GrandChild extends Child{
    protected void grandChildMethod(){
        System.out.println("This is the GrandChild Method...");
    }
}
