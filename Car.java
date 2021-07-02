import java.io.Serializable;

// Converting Car Class into a ByteStream using Serialization
// All subclasses of Car class -> also Serializable 
public class Car implements Serializable{

    // Verify sender and reciever of object have loaded classes for the object using serialVersionUID
    // Check whether serialized object is same as deserialized object
    // private static final long serialVersionUID = 1L;

    // Java -> generate SerialVersionUID on its own

    // field variables
    String carBrand;
    int MotorNumber;
    String color;

    // transient keyword -> prevents fields from being serialized
    // transient String color;

    // Constructor for the class
    public Car(String carBrand, int MotorNumber, String color){
        this.carBrand = carBrand;
        this.MotorNumber = MotorNumber;
        this.color = color;
    }

    // Override the toString method
    @Override
    public String toString(){
        return this.carBrand + "-" + this.MotorNumber + "-" + this.color;
    }
}
