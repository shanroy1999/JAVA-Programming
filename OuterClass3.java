public class OuterClass3 {

    private static String message = "This is the 3rd Outside Class Message instance....";

    // Creating a static Nested Class
    static class Nested{
        public void showMessage(){
            System.out.println(message);        // Static nested -> Unable to access private instance of Outer
        // Instance of Outer Class -> should be "private static" for making it accessible to method in Nested class
        }
    }
    
}
