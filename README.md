
## Run the tests
### Use Maven

Open a command window and run:

    cd maven
    ./mvnw test

This runs Cucumber features using Cucumber's JUnit Platform Engine. The `Suite`
annotation on the `RunCucumberTest` class tells JUnit to kick off Cucumber.

### Use Gradle

Open a command window and run:

    cd gradle
    ./gradlew test --rerun-tasks --info

This runs Cucumber features using Cucumber's JUnit Platform Engine. The `Suite`
annotation on the `RunCucumberTest` class tells JUnit to kick off Cucumber.


