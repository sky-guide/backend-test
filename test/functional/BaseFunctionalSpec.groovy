import geb.spock.GebReportingSpec
import pages.BookListPage
import pages.BookVersionsPage

class BaseFunctionalSpec extends GebReportingSpec {

    def "all pages are returned"() {
        when:
        to BookListPage

        then:
        pages.size() == 3

        and:
        pages(0).name.text() == "book one"
        pages(1).name.text() == "book two"
        pages(2).name.text() == "book three"
    }

    def "when there is no live version and all other versions are in the future, return all the versions"() {
        when:
        to BookVersionsPage, "book one"

        then:
        versions.size() == 4

        and:
        versions(0).id.text() == "1"
        versions(0).name.text() == "book one"

        // TODO: Improve test coverage
    }

    // TODO: Implement the following test
    def "when there is a live version return the live version and all pages after it based on schedule time"() {}

    // TODO: Implement the following test
    def "when there is no live version and there are versions in the past and in the future, return most recent one in the past and  all pages after it based on schedule time"() {}
}
