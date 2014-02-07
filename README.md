# Cognitive Imperative Application

## Overview

Cognitive Imperative is a system provided by a company that allows editors of a CMS to create versions of a
particular page and schedule them to go live at certain times.


## Task

* Implement the 'TODOs' in the /page/index and /page/show files (found in grails-app/views)
* Make each data field sortable
* Match design of the implemented pages according to provided specifications
* Bonus: Implement the functional test provided in BaseFunctionalSpec.groovy

Preferably your solution should use AngularJS and SASS frameworks but this is not a hard requirement.

We have provided two JSON feeds in order for easier integration of data into a JS app:
* /page.json for all pages
* /page/show/[page_name].json for specific page versions

The two URLs to the pages to be styled are:
* /page for all pages
* /page/show/[page_name] for specific page versions

## Files

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


## Installation

To run the application you will need to have Java, Node.js, NPM installed.

Run the following commands in project root directory:

````
make install
````

## Running The Application

To run the application, navigate to the project folder and run the following command:
````
make run-app
````

## How To Run The Functional Tests

To run the functional tests on the command line:
````
make test-app
````

## How To Run The JS Tests

To run the JS tests on the command line:
````
make test-app-js
````

## Things To Think About

Please bear in mind all the best practices you would normally employ when producing production code:

* A well factored, simple solution
* Testing
* Clean code

## Your Solution

Once you have completed the test please send us the link to your forked repo or zip it and send it back.

Please bear in mind that your solution will be visible to others, so you should delete your repo once we have reviewed it.
