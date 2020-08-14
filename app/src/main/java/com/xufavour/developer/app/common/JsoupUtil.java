package com.xufavour.developer.app.common;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Map;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/25
 */
public class JsoupUtil {

    public static String httpGet(String path, String cookie) {
        try {
            Connection.Response response = Jsoup.connect(path)
                    .ignoreContentType(true)
                    .header("Cookie", cookie)
                    .timeout(20000)
                    .method(Connection.Method.GET)
                    .execute();
            return response.body().toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String postHttp(String path, Map<String, String> params, String cookie) {
        try {
            Connection.Response response = Jsoup.connect(path)
                    .ignoreContentType(true)
                    .header("Cookie", cookie)
                    .timeout(20000)
                    .data(params)
                    .method(Connection.Method.POST)
                    .execute();
            return response.body().toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
