import geb.spock.GebReportingSpec
import pages.HomePage
import pages.PageListPage
import pages.PageVersionsPage

class BaseFunctionalSpec extends GebReportingSpec {

    def "all pages are returned"() {
        when:
        to PageListPage

        then:
        pages.size() == 3

        and:
        pages(0).name.text() == "page one"
        pages(1).name.text() == "page two"
        pages(2).name.text() == "page three"
    }

    def "when there is no live version and all other versions are in the future, return all the versions"() {
        when:
        to PageVersionsPage, "page one"

        then:
        versions.size() == 4

        and:
        versions(0).id.text() == "1"
        versions(0).name.text() == "page one"

        // TODO: expect these to be written by the interviewee
//        versions(1).id.text() == "2"
//        versions(1).name.text() == "page one"
//        versions(2).id.text() == "3"
//        versions(2).name.text() == "page one"
//        versions(3).id.text() == "4"
//        versions(3).name.text() == "page one"
    }

    def "when there is no live version and there are versions in the past and in the future, return most recent one in the past and its following versions"() {}

    def "when there is a live version return the live version and all its following versions"() {}
}
