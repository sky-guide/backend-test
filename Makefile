run-app:
	./grailsw run-app

run-app-test:
	./grailsw test run-app

test-app:
	make test-app-unit
	make test-app-integration
	make test-app-functional

test-app-unit:
	./grailsw test-app unit:

test-app-integration:
	./grailsw test-app integration:

test-app-functional:
	./grailsw test-app functional:
