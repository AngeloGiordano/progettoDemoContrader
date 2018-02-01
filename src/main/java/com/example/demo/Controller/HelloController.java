package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello (){
        return "Hello World";
    }

    @RequestMapping(value="/prova",method= RequestMethod.GET)
    public String prova(){

        RestTemplate restTemplate = new RestTemplate();
        String quote = restTemplate.getForObject("https://min-api.cryptocompare.com/data/price?fsym=EUR&tsyms=LIT", String.class);
        return quote;
    }
}
