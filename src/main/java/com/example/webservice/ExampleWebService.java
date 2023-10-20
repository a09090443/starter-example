package com.example.webservice;

import com.example.model.User;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;

import javax.jws.WebService;
import java.util.Map;

@WebService(targetNamespace = "http://service.example.com")
public interface ExampleWebService {

    @WebMethod//標注該方法為webservice暴露的方法,用於向外公布，它修飾的方法是webservice方法，去掉也沒影響的，類似一個注釋信息。
    public User getUser(@WebParam(partName = "userName") String userName);

    @WebMethod
    public String getUserGender(String userName);

    @WebMethod
    @WebResult(name = "Map")
    public Map<String, User> getAllUserData();
}
