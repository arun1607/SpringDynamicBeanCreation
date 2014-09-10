package com.learning.spring.config;

import com.learning.spring.service.AnotherService;
import com.learning.spring.service.UserService;
import com.learning.spring.service.UserServiceImpl_1;
import com.learning.spring.service.UserServiceImpl_2;

/**
 * Created by amits on 10/09/14.
 */

public class CustomBeanFactory {

    private AnotherService anotherService;

    public void setAnotherService(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    private static CustomBeanFactory INSTANCE = new CustomBeanFactory();

    private CustomBeanFactory() {

    }

    public static CustomBeanFactory getInstance() {
        return INSTANCE;
    }

    public UserService getService(TenantLookupProvider tenantLookupProvider) {
        if (tenantLookupProvider.getId() == 1) {
            UserServiceImpl_1 userService = new UserServiceImpl_1();
            userService.setAnotherService(anotherService);
            return new UserServiceImpl_1();
        } else {
            return new UserServiceImpl_2();
        }
    }

    public UserService getServiceImpl(int id) {
        if (id == 1) {
            UserServiceImpl_1 userService = new UserServiceImpl_1();
            userService.setAnotherService(anotherService);
            return new UserServiceImpl_1();
        } else {
            return new UserServiceImpl_2();
        }
    }
}
