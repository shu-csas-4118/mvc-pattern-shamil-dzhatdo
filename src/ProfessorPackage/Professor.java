package ProfessorPackage;

public class Professor {

    private String firstName;       //Purpose: First name of the professor.
    private String lastName;        //Purpose: Last name of the professor.
    private String email;           //Purpose: The professor's email address.
    private String phoneNumber;     //Purpose: The professor's phone number.

    //Purpose: Returns this professor's first name.
    public String getFirstName() {
        return firstName;
    }

    //Purpose: Sets this professor's first name to the new name.
    //Effect: this.firstName is mutated to be the input name.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Purpose: Returns this professor's last name.
    public String getLastName() {
        return lastName;
    }

    //Purpose: Sets this professor's last name to the new name.
    //Effect: this.lastName is mutated to be the input name.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Purpose: Returns this professor's email address.
    public String getEmail() {
        return email;
    }

    //Purpose: Sets this professor's email to the new name.
    //Effect: this.email is mutated to be the input email.
    public void setEmail(String email) {
        this.email = email;
    }

    //Purpose: Returns this professor's phone number.
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Purpose: Sets this professor's phone number to the new number.
    //Effect: this.phoneNumber is mutated to be the input string.
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
