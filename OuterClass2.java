public class OuterClass2 {
    private String message = "This is a Message Instance Variable of Outer Class....";

    // Creating a Member Inner Class in the Outer Class but outside method
    class InnerClass2{                          // Inner Class created inside outer class
        public void showMessage(){              // Method associated with inner class
            System.out.println(message);        // Inner class can access the variable instance of OuterClass
        }
    }
}
