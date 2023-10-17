import net.bytebuddy.asm.Advice;

public class User {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    private String countryOfBirth;

    public User(String fname, String lname, String dob, String cob) {
        this.firstName=fname;
        this.lastName=lname;
        this.dateOfBirth=dob;
        this.countryOfBirth=cob;
    }

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }
    // Constructors, getters, and setters
}
