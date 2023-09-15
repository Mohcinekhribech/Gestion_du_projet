public class Contact {
    private String name ;
    private String adressWeb;
    private int phoneNumber;
    private Client client;
    private Project project;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressWeb() {
        return adressWeb;
    }

    public void setAdressWeb(String adressWeb) {
        this.adressWeb = adressWeb;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
