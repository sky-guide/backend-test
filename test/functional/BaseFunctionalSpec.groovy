import geb.spock.GebReportingSpec
import pages.HomePage

class BaseFunctionalSpec extends GebReportingSpec {
    def "reference functional test"() {
        when:
        to HomePage

        then:
        title == "Welcome to Cognitive Imperative"
    }
}
