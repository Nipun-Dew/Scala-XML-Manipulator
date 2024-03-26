import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
public class Employee {
    private Long name;

    @XmlElement(name = "name")
    public void setName(Long name) {
        this.name = name;
    }
}
