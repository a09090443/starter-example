package com.example.service.impl;

import com.example.model.User;
import com.example.service.ExampleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ExampleServiceImpl implements ExampleService {

    @Override
    public List<User> findUsers() {
        return new ArrayList<>(
                Arrays.asList(
                        new User("Gary", "M"),
                        new User("Mary", "F"),
                        new User("Cindy", "F"),
                        new User("Johnson", "M"),
                        new User("Fiona", "F")
                )
        );
    }
}
