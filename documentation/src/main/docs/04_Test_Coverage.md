# - Measuring Test Coverage -

* Use [JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/) for measuring test coverage

* Added to the parent Maven pom.xml
* Run as: mvn clean package
* View the reports under: fizz-buzz-project/target/site/jacoco/index.html


    <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.6</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>prepare-package</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
