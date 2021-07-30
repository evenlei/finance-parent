package com.monkey.fund.input.request;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class HttpRequest {


    public static String request(String url, String method) {
        return null;
    }

//    public static void main(String[] args) throws IOException {
//        CloseableHttpClient client = HttpClientBuilder.create().build();
//        HttpGet get = new HttpGet("http://localhost:8009/api/organization/company/list");
//
//        CloseableHttpResponse resp = client.execute(get);
//        HttpEntity entity = resp.getEntity();
//        System.out.println(EntityUtils.toString(entity));
//
//    }

}
