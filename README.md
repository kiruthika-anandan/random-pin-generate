# random-pin-generate
The pinGenerator project is meant to generate 1000 unique 4 digit PINs. 
The Main Class RandomPINGenerator.java uses SecureRandom class to generate a strong random number.
Use string format to make random number length as 4.
Using a HashSet to store the list of secure random PINs to make sure they are unique and has no duplicates.

There are 2 unit tests that check the functional aspects of the program
(i)Every random PIN has 4 digits
(ii)The HashSet collection has 1000 PINs. Also Check multiple runs of the function.

The pom.xml lists all the dependencies and build configurations.
A maven-assembly-plugin is used to build a library of this project.

Following maven goal can be executed to build a jar (will be generated inside target folder):
mvn clean package 
