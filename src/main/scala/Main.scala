import java.io.{File, FileReader}
import javax.xml.bind.{JAXBContext, Marshaller}

object Main extends App {
  private val employee: Employee = new Employee()
  private val contact: Contacts = new Contacts("0774234235", "test@gmail.com", "test")
  private val context = JAXBContext.newInstance(classOf[Employee])
  private val marshaller = context.createMarshaller
  private val unMarshaller = context.createUnmarshaller

  private def generateXml(): Unit = {
    employee.setName("Nipun Dew")
    employee.setEmployeeId("12152293845")
    employee.setContacts(contact)

    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
    marshaller.marshal(employee, new File("./employee.xml"))

    println("File created successfully!")
  }

  private def generateContactXml(): Unit = {
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
    marshaller.marshal(contact, new File("./contact.xml"))

    println("File created successfully!")
  }

  private def readXml(): Unit = {
    val xmlFile = new FileReader("./src/main/scala/samples/employee.xml")
    val data = unMarshaller.unmarshal(xmlFile).asInstanceOf[Employee]

    println(data.getName)
  }

  readXml()

}
