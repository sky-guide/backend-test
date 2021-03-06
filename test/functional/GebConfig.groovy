import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

driver = { new FirefoxDriver() }
baseUrl = 'http://localhost:8080'
reportsDir = "target/geb-reports"

environments {

  // run as “grails -Dgeb.env=chrome test-app”
  // See: http://code.google.com/p/selenium/wiki/ChromeDriver
  chrome {
    driver = { new ChromeDriver() }
  }

  // run as “grails -Dgeb.env=firefox test-app”
  // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
  firefox {
    driver = { new FirefoxDriver() }
  }

}