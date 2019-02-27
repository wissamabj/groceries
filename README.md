# groceries

<b>#Purpose:</b><br/> The purpose of this project is to calculate the final amount to be paid after a transction is being created taking into consideration the Person that is doing the transction. If the Person is an Employee, then a 30% is to be deducted from the subtotal price. If the Person is an Affiliate for the company, then a 10% is to be deducted from the subtotal price. If the Person is a Customer, then a 5% is to be deducted from the subtotal price, taking into consideration that the customer should have been at least two years a Customer of the company. The Percentage deduction is not applied on Groceries.

An additional deduction of 5$ should be done on every 100$ of the transaction. This deduction will be calculated after the percentage deduction.

<b>#Build the project:</b><br/>
This project depends on JAVA 8.<br/>
This project run with a main java function defined in the class App.java<br/>
To build and run the unit test, using the command line of the windows navigate to the root directory of the project where the file POM.xml reside and run the following commands:<br/>
mvn clean<br/>
mvn install<br/>
Using the above commands the project will be built and the unit test will be executed.<br/>
The coverage report will be built after the maven install runs successfully under the directory target/groceries-report

<b>#Run the project:</b><br/>
To run the project, open the Command prompt and run the following command:<br/>
java -cp "<PATH_TO_PROJECT_REPOSITORY>\target\groceries-project-1.0-SNAPSHOT.jar" com.test.groceries.groceries_project.App
