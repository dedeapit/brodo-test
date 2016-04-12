# brodo-test
webapp for brodo testing

BrodoService need to install maven/gradle
After installation you need to open command prompt, cd to location BrodoService
You can run it with maven:
mvn spring-boot:run, or build it with mvn clean package then java -jar target/gs-rest-service-0.1.0.jar
or build with gradle:
./gradlew build
java -jar build/libs/gs-rest-service-0.1.0.jar

At location BrodoService\src\main\java\service\ProductController.java, you can change the CrossOrigin base on your port.
