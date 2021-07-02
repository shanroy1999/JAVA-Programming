// Using Inheritance to extend parent class
// Child inherits all methods and instance variables from parentClass
public class Child extends Parent{

    // Override the protected method present in Parent Class using Child Class
    // Child Class Cannot override method if it is private in Parent Class

    @Override
    protected void parentMethod(){
        super.parentMethod();                 // accessing the method present in the super class(Parent)
    }

    /*
    @Override
    protected void method2(){           // cannot access method of parent class if it is private
        super.method2();
    }
    */

    protected void childMethod(){
        System.out.println("Method is in Child Class...");
    }
}
