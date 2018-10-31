package SecondThird;

public class ContactInformation {
    private int id;
    private String name;
    private String email;
    private int phone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone()
    {
        return this.phone;
    }
    public void setPhone(int phone){
        this.phone=phone;
    }
    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email=email; }

    public ContactInformation(String name, int id, String address, String email, int phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone=phone;
        this.email=email;
    }
}
