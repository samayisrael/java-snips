public class Contact {

    private String name;
    private PhoneNumber phone;
    private String email;

    public Contact(String name, PhoneNumber phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    public Contact(String name, PhoneNumber phone) {
        this.name = name;
        this.phone = phone;
    }

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString(){
      return "Contact {"+name+" phone "+phone+" email "+email+"}";
    }
}
