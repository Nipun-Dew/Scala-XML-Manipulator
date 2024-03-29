import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "contact")
public class Contacts {
    private String mobile;
    private String email;
    private String address;

    public Contacts() {
    }

    public Contacts(String mobile, String email, String address) {
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    @XmlElement(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @XmlElement(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
