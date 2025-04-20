package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloServiceTest {

    @Test
    public void testSayHello() {
        HelloService service = new HelloService();
        String result = service.sayHello("World");
        assertEquals("Hello, World!", result);
    }
}
