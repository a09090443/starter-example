package com.example.webservice.impl;

import com.example.model.User;
import com.example.webservice.ExampleWebService;
import jakarta.jws.WebParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(serviceName = "ExampleWebService",//對外發布的服務名
        targetNamespace = "http://service.example.com",//指定你想要的名稱空間，通常使用使用包名反轉
        endpointInterface = "com.example.webservice.ExampleWebService")
//服務接口全路徑, 指定做SEI（Service EndPoint Interface）服務端點接口
@Component
public class ExampleWebServiceImpl implements ExampleWebService {

    private final Logger logger = LoggerFactory.getLogger(ExampleWebServiceImpl.class);
    private final Map<String, User> userMap = new HashMap<>();

    public ExampleWebServiceImpl() {
        logger.info("向實體類插入數據");
        User user = new User("Gary", "M");
        userMap.put(user.getName(), user);

        user = new User("Mary", "F");
        userMap.put(user.getName(), user);

        user = new User("Cindy", "F");
        userMap.put(user.getName(), user);
    }

    @Override
    public String getUserGender(@WebParam(partName = "userName", targetNamespace = "http://service.example.com") String userName) {
        logger.info("userName：{}", userMap.get(userName).getGender());
        return userMap.get(userName).getGender();
    }

    @Override
    public User getUser(String userName) {
        logger.info("userMap是:{}", userMap);
        return userMap.get(userName);
    }

    @Override
    public Map<String, User> getAllUserData() {
        return userMap;
    }

}
