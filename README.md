# COGNITIVE IMPERATIVE APPLICATION

## OVERVIEW

Cognitive Imperative is a system provided by a company that allows editors of a CMS to create versions of a
particular page and schedule them to go live at certain times. There is a requirement that the list view of a certain
page should be filtered based on certain rules.


## TASK

Implement the filtering rules, defined below, that will ensure only the correct versions of a page are displayed on its
versions page.

The versions page of a particular page should filter based on the following rules:

* Pages with a 'Live' version should return the live page followed by all pages after it based on schedule time
* Pages that do not have a 'Live' version should return the most recent page from the past followed by all pages after it based on schedule time


## FILES

The code and tests have been split over several files:

Source Code:

Page.groovy - (grails-app/domain/com/sky/test/Page.groovy)

PageController.groovy - (grails-app/controllers/com/sky/test/PageController.groovy)

Test Code:
BaseFunctionalSpec.groovy - (grails-app/domain/com/sky/test/BaseFunctionalSpec.groovy)

Views:
The views can be found in grails-app/views

Your solution is not limited to these files.


## INSTALLATION

To run the application you will need to have Java installed.


## RUNNING THE APPLICATION

To run the application, navigate to the project folder and run the following command:

./grailsw run-app

To run the application in test mode, navigate to the project folder and run the following command:

./grailsw test run-app


## HOW TO RUN THE TESTS

To run the tests on the command line:

./grailsw test-app [unit:|integration:|functional:]


## THINGS TO THINK ABOUT

Please bear in mind all the best practices you would normally employ when producing "done" production code:

* A well factored object-oriented solution
* Testing
* Clean code


## YOUR SOLUTION

Once you have completed the test please create a pull request on our github page
