package org.example.services;

import org.springframework.stereotype.Service;

@Service
public class FooService implements SomeService {
    @Override
    public void foo() {
        System.out.println("foo service");
    }
}
