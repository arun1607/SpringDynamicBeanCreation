Small POC to demostrate spring bean creation (protoype) according to argument passed to getBean() method of applicationContext.

To run the program from IDE, use com.learning.spring.App class.

Change second parameter of getBean method to get different output in console.

 UserService userService = (UserService) applicationContext.getBean("userService", 1);
