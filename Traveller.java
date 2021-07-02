import java.util.Optional;
public class Traveller {
    // private String name;
    // private Passport passport;

    private String name;
    private Optional<Passport> passport;            // no need to check if person passport is null or not
                                                    // Optional -> checks it

    // Initialization using Cosntructor
    // public Traveller(String name, Passport passport){
    public Traveller(String name, Optional<Passport> passport){
        this.name = name;
        this.passport = passport;
    }

    // Getter and Setters
    public String getName(){
        // return this.name;
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // public Passport getPassport(){
    public Optional<Passport> getPassport(){
        // return this.passport;
        return passport;                            // returns an Optional
    }

    // public void setPassport(Passport passport){
    public void setPassport(Optional<Passport> passport){
        this.passport = passport;
    }
}
