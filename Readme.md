
# Password Validation Service
---
Write a password validation service, meant to be configurable via IoC (using dependency injection engine of your choice).  The service is meant to check a text string for compliance to any number of password validation rules.  The rules currently known are:
	* Must consist of a mixture of lowercase letters and numerical digits only, with at least one of each.
	* Must be between 5 and 12 characters in length.
	* Must not contain any sequence of characters immediately followed by the same sequence.

## Gradle : Build tool: 
---
Gradle runs on all major operating systems and requires only a Java JDK or JRE version 7 or higher to be installed. To check, run java -version:
 
    `$ java -version
	 java version "1.8.0_121"`
	 
Gradle Install on windows :
	 	  
	 `$ scoop install gradle`
	 
### Implementation Classes:
---
 * Client.java : This is the main class for accessing application components. This class also provides the ability to load file resources in a generic fashion.
 * AppConfig.java : This class has one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
 * PasswordService.java : This is the service implementation class where entire login has been written. 
 
### JUnit Test case written for almost all the possible test cases
---
Refer PasswordTest.java for unit test cases


