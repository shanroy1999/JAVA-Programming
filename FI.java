// Declaring a Functional Interface
@FunctionalInterface
public interface FI {
    public int add(int num1, int num2);

    static void staticMethod(){
        System.out.println("This is a Static Method inside Functional Interface FI");
    }
}
