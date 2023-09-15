import java.util.List;

public class Employe{
    private int registrationNumber;
    private String firstName ;
    private  String lastName;
    private  int phoneNumber ;
    private String email ;
    private String password ;
    private List <PhaseEmploye> phaseEmployes;

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    Employe addEmploye(Employe employe)
    {
        return null;
    }
    Employe updateEmploye(Employe user)
    {
        return null;
    }
    boolean deleteEmploye(int id)
    {
        return false ;
    }
}
