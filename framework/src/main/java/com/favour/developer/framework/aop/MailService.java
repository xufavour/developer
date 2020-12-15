package com.favour.developer.framework.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class MailService {
    @Autowired
    UserService userService;

    public String sendMail() {
        ZoneId zoneId1 = userService.zoneId;
        try {
            String dt = ZonedDateTime.now(zoneId1).toString();
            System.out.println(dt);
        }catch (Exception e){
            e.printStackTrace();
        }
        ZoneId zoneId2 = userService.getZoneId();
        userService.testLocalMethod();
        String dt = ZonedDateTime.now(zoneId2).toString();
        return "Hello, it is " + dt;
    }
}