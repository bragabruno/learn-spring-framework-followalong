package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor,
//equals, hashcode and toString are automatically created.
//Released in JDK 16.

record Person (String name, int age, Address address) { };

record Address (String firstLine, String city) { };
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public Person person() {
        return new Person("Ravi",20, new Address("Main Street", "Utrecht"));
    }
     @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // name, age
    }

    @Bean
     public Person person3Parameters(String name, int age, Address address3) {// name, age, address2
        return new Person(name, age, address3); // name, age
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Baker Street", "London" );
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("Motinagar", "Hiderabad" );
    }
}
