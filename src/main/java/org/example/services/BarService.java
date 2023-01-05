package org.example.services;

import org.springframework.stereotype.Service;

@Service
public class BarService implements SomeService {
    @Override
    public void foo() {
        System.out.println("bar service");
    }
}
