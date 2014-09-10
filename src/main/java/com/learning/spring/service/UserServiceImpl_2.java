package com.learning.spring.service;

/**
 * Created by amits on 10/09/14.
 */
public class UserServiceImpl_2 implements UserService {


    private AnotherService anotherService;

    public void setAnotherService(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    @Override
    public void perform() {
        System.out.println("Inside first implementation");
    }
}
