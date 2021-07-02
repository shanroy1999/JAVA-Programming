public class OuterClass {
    private String message = "Message Instance Variable of Outer Class....";

    // Creating a Local Inner Class inside the outerMethod() of Outer Class
    public void outerMethod(){
        class InnerClass{               
            public void showMessage(){
                System.out.println(message);        // able to access the intance variable of OuterClass
                                                    // Message printed within the Inner Class
            }
        }

        InnerClass inner = new InnerClass(); // inner class instantiated inside the method
        inner.showMessage();                
    }
}
