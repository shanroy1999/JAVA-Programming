import java.util.Optional;
public class Passport {

    // private Stamp stamp;                     // If stamp -> not null
    private Optional<Stamp> stamp;              // If null -> handled using Optional

    // Create constructor
    // public Passport(Stamp stamp){            // If stamp -> not null
    public Passport(Optional<Stamp> stamp){
        this.stamp = stamp;
    }

    // Getter and Setters
    // public Stamp getStamp(){                 // If stamp -> not null
    public Optional<Stamp> getStamp(){
        // return this.stamp;
        return stamp;                           // Returns an Optional
    }

    // public void setStamp(Stamp stamp){
    public void setStamp(Optional<Stamp> stamp){
        this.stamp = stamp;
    }
}
