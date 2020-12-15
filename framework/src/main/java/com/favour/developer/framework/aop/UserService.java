package com.favour.developer.framework.aop;

import org.springframework.stereotype.Component;

import java.time.ZoneId;

@Component
public class UserService {
    // 成员变量:
    public final ZoneId zoneId = ZoneId.systemDefault();

    public int A = 10;

    public static int sA = 100;
    // 构造方法:
    public UserService() {
        System.out.println("UserService(): init...");
        System.out.println("UserService(): zoneId = " + this.zoneId);
    }

    // public方法:
    public ZoneId getZoneId() {
        return zoneId;
    }

    public String testLocalMethod() {
        System.out.println(getZoneId());
        System.out.println("testLocalMethod");
        return "test";
    }

    // public final方法:
    public final ZoneId getFinalZoneId() {
        return zoneId;
    }
}