package SecondFirstTask;

public class ContactInformation {
    private String email;
    private int phone;

    public int getPhone(){
        return this.phone;
    }
    public void setPhone(int phone){
        this.phone=phone;
    }
    public String getEmail(){
        return this.email;
        }
    public void setEmail(String email){
        this.email=email;
         }
    public ContactInformation(String email, int phone) {
        this.phone=phone;
        this.email=email;
    }
}
