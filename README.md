# groceries

#Purpose: The purpose of this project is to calculate the final amount to be paid after a transction is being created taking into consideration the Person that is doing the transction. If the Person is an Employee, then a 30% is to be deducted from the subtotal price. If the Person is an Affiliate for the company, then a 10% is to be deducted from the subtotal price. If the Person is a Customer, then a 5% is to be deducted from the subtotal price, taking into consideration that the customer should have been at least two years a Customer of the company. The Percentage deduction is not applied on Groveries.

An additional deduction of 5 should be done on every 100 of the transaction. This deduction will be calculated after the percentage deduction.

#Build the project:
This project depends from JAVA 8.
This project run with a main java function defined in the class App.java
To build and run the unit test, using the command line of the windows navigate to the root directory of the project where the file POM.xml reside and run the following commands:
mvn clean
mvn install
Using the above commands the project will be built and the unit test will be executed.
The coverage report will be built after the maven install runs successfully under the directory target/groceries-report

#Run the project:
To run the project, open the Command prompt and run the following command:
java -cp "<PATH_TO_PROJECT_REPOSITORY>\groceries-master\target\groceries-project-1.0-SNAPSHOT.jar" com.test.groceries.groceries_project.App
