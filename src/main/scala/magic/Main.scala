package magic;
import com.fasterxml.jackson.databind.ObjectMapper
import mesosphere.jackson.CaseClassModule

object Main extends App {

  val mapper = new ObjectMapper
  mapper.registerModule(CaseClassModule)

  case class Person(name: String, age: Integer = 30)

  val readResult = mapper.readValue(
    """{ "name": "Alfonso" }""",
    classOf[Person]
  )

  assert(readResult.age == 30) // hooray

}
