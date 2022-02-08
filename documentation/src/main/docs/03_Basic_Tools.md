# - Build Tools -

* The different tools are:
  * Java JDK 11+
  * Maven
  * This starter project
  * JUnit, AssertJ, Mockito
  * Spring Framework
  
----
* [Maven](https://maven.apache.org/what-is-maven.html) - build tool
* [JUnit](https://junit.org/junit5/) - framework for writing tests
* [AssertJ](https://assertj.github.io/doc/) - for fluent assertions of test results
* [Mockito](https://site.mockito.org/) - for using mock objects in tests
* [Spring](https://spring.io/projects/spring-framework) - Spring framework
* [Spring Container](https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring) - Spring IoC container
* [Spring Bean Annotations](https://www.baeldung.com/spring-application-context) - Spring Bean annotations (AnnotationConfigApplicationContext)


    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-api</artifactId>
      <version>5.6.2</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.assertj</groupId>
      <artifactId>assertj-core</artifactId>
      <version>3.16.1</version>
      <scope>test</scope>
    </dependency>

    <dependency>
    
      <groupId>org.mockito</groupId>
      <artifactId>mockito-core</artifactId>
      <version>3.3.3</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
      <version>2.3.3.RELEASE</version>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <version>2.3.3.RELEASE</version>
      <scope>test</scope>
      <exclusions>
        <exclusion>
          <groupId>org.junit.vintage</groupId>
          <artifactId>junit-vintage-engine</artifactId>
        </exclusion>
      </exclusions>
    </dependency>
