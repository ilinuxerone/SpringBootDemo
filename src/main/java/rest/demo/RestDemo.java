package rest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/8/26.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
@RequestMapping(value = "/v1/rest")
public class RestDemo {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(RestDemo.class, "--server.port=8080");
    }
}
