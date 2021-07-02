// Creating a generic class
public class Box<T>{
    private T element;          // generic data type stored by class

    public Box(T element){
        this.element = element;
    }

    public T getElement(){
        return this.element;
    }

    public void setElement(T element){
        this.element = element;
    }
}
