# spring-boot-with-jpa-streamer

JPAstreamer is a lightweight extension for any JPA provider that allows creation of Java Streams from database content.With a single dependency, your application can immediately operate on database elements using standard Stream operators e.g. filter(), sort() and map().

## Dependencies
```javascript
  <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
        </dependency>
        <dependency>
            <groupId>com.speedment.jpastreamer</groupId>
            <artifactId>jpastreamer-core</artifactId>
            <version>1.0.1</version>
        </dependency>
        <dependency>
            <groupId>com.speedment.jpastreamer.integration.spring</groupId>
            <artifactId>spring-boot-jpastreamer-autoconfigure</artifactId>
            <version>1.0.1</version>
        </dependency>
  </dependencies>
```

## Plugin
```javacript
    <plugins>
            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>build-helper-maven-plugin</artifactId>
                <version>3.2.0</version>
                <executions>
                    <execution>
                        <phase>generate-sources</phase>
                        <goals>
                            <goal>add-source</goal>
                        </goals>
                        <configuration>
                            <sources>
                                <source>
                                    ${project.build.directory}/generated-sources/annotations
                                </source>
                            </sources>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
     </plugins>       
```

## JPA Streamer Function
<div style="border-radius:23px">
  <img border="0" alt="Table" src="https://user-images.githubusercontent.com/25712816/128547952-d59a6936-de3d-47f4-9ecd-188829c02e2b.PNG" width="500" height="400">
</div>  
