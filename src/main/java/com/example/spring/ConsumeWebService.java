//package com.example.spring;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//
//
//@RestController
//public class ConsumeWebService {
//
//    @Autowired
//    RestTemplate restTemplate;
//
//
//    @RequestMapping(value = "/template/products")
//    public String getProductList(@RequestBody Product product){
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<Product> entity = new HttpEntity<Product>(product, headers);
//
//        return restTemplate.exchange("http://localhost:8080/products", HttpMethod.POST, entity, String.class).getBody();
//    }
//}
