package com.example.service.impl;

import com.example.entity.InfoEntity;
import com.example.entity.UserEntity;
import com.example.model.User;
import com.example.repository.InfoRepository;
import com.example.repository.UserRepository;
import com.example.service.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tw.com.webcomm.base.annotation.DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class ExampleServiceImpl implements ExampleService {

    private final UserRepository userRepository;
    private final InfoRepository infoRepository;

    ExampleServiceImpl(UserRepository userRepository, InfoRepository infoRepository) {
        this.userRepository = userRepository;
        this.infoRepository = infoRepository;
    }

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

    @DS(value = "common")
    public void findExample1Data() {
        List<UserEntity> list = userRepository.findAll();
        list.forEach(data ->{
            log.debug(data.toString());
        });
    }

    public void findExample2Data() {
        List<InfoEntity> list = infoRepository.findAll();
        list.forEach(data ->{
            log.debug(data.toString());
        });
    }
}
