package com.example.webservice;

import tw.com.webcomm.model.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Map;

@WebService(targetNamespace = "http://service.example.com/")
public interface ExampleUserService {

    @WebMethod//標注該方法為webservice暴露的方法,用於向外公布，它修飾的方法是webservice方法，去掉也沒影響的，類似一個注釋信息。
    public User getUser(@WebParam(name = "name", targetNamespace = "http://service.example.com/") String name);

    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    public String getUserId(@WebParam(name = "name", targetNamespace = "http://service.example.com/") String name);

    @WebMethod
    @WebResult(name = "Map")
    public Map<String, User> getAllUserData();
}
