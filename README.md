# TestNG Listener

## About
This repository contains [listeners](http://testng.org/doc/documentation-main.html#testng-listeners) example of TestNG.

There is:

  * a [test listener](./src/main/java/com/gerardnico/testng/TestListener.java)
  * a [suite listener](./src/main/java/com/gerardnico/testng/SuiteListener.java)
  * a [alter suite listener](./src/main/java/com/gerardnico/testng/SuiteAlterListener.java)
  * a [reporter listener](./src/main/java/com/gerardnico/testng/Reporter.java)
  * a [method listener](./src/main/java/com/gerardnico/testng/MethodListener.java)
  
  
## Registration

The listeners are registered via [SPI](https://gerardnico.com/lang/java/spi) in the file [org.testng.ITestNGListener](./src/main/resources/META-INF/services/org.testng.ITestNGListener).

## Usage

Just install locally a JAR of this repo, add it in your project with the following maven dependency and you are done.

```xml
<dependency>
    <groupId>com.gerardnico</groupId>
    <artifactId>testng</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>test</scope>
</dependency>
``` 

## Documentation

  * [TestNG Listeners](http://testng.org/doc/documentation-main.html#testng-listeners)
    * [Specifying listeners with ServiceLoader](http://testng.org/doc/documentation-main.html#listeners-service-loader)
    * [Logging Listeners](http://testng.org/doc/documentation-main.html#logging-listeners)
    * [Logging Reporters](http://testng.org/doc/documentation-main.html#logging-reporters)