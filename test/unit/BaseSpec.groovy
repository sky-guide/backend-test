import spock.lang.Specification

class BaseSpec extends Specification {
  def "reference test"() {
    given:
    def id = 1
    def name = 'name'

    when:
    Base base = new Base(id: id, name: name)

    then:
    base.id == id
    base.name == name
  }
}
