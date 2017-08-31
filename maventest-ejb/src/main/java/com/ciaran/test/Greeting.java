package com.ciaran.test;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.io.PrintStream;

/**
 * Hello world!
 *
 */
@Singleton
@Startup
public class Greeting implements GreetLocal, GreetRemote
{
    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }

    @PostConstruct
    public void doOnStartup() {
        System.out.println("Here I am at startup...");
    }

}
