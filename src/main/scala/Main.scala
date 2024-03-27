import java.io.File
import javax.xml.bind.{JAXBContext, Marshaller}

object Main extends App {
  private val employee: Employee = new Employee()
  private val context = JAXBContext.newInstance(classOf[Employee])
  private val marshaller = context.createMarshaller()

  employee.setName("Nipun Dew")
  employee.setEmployeeId("12152293845")

  marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
  marshaller.marshal(employee, new File("./book.xml"))

  println("File created successfully!")
}
