npm-install:
	npm install

bower-install:
	./node_modules/.bin/bower install

install: npm-install bower-install

run-app:
	./grailsw run-app

test-app:
	./node_modules/.bin/grunt karma
