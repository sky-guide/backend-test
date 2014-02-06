# COGNITIVE IMPERATIVE APPLICATION

## OVERVIEW

Cognitive Imperative is a system provided by a company that allows editors of a CMS to create versions of a
particular page and schedule them to go live at certain times.


## TASK

* Implement the 'TODOs' in the /page/index and /page/show files (found in grails-app/views)
* Make each data field sortable
* Match design of the implemented pages according to provided specifications
* Bonus: Implement the functional test provided in BaseFunctionalSpec.groovy

Preferably your solution should use AngularJS and SASS frameworks but this is not a hard requirement.

We have provided two JSON feeds in order for easier integration of data into a JS app:
* /page/show.json for all pages
* /page/show/[page_name].json for specific page versions

## FILES

The code has been split over several files:

**Configuration:**

* package.json
* GruntFile.js
* bower.json

**Views/HTML:**
* The views can be found in grails-app/views

**CSS/JS:**
* Directories for CSS and JS can be found in web-app

**JS Tests:**
* The blank js unit test file is located in web-app/test/spec

Your solution is not limited to these files.


## INSTALLATION

To run the application you will need to have Java, Node.js, NPM installed.

Run following commands in project rood directory:

````
npm install
./node_modules/.bin/bower install
````

## RUNNING THE APPLICATION

To run the application, navigate to the project folder and run the following command:
````
./grailsw run-app
````

## HOW TO RUN THE TESTS

To run the tests on the command line:
````
./node_modules/.bin/grunt karma
````

## THINGS TO THINK ABOUT

Please bear in mind all the best practices you would normally employ when producing "done" production code:

* A well factored simple solution
* Testing
* Clean code

## YOUR SOLUTION

Once you have completed the test please zip it and send it back.
