package rest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/8/26.
 */

/*
@SpringBootApplication相当于@Configuration、@EnableAutoConfiguration和  @ComponentScan，
你也可以同时使用这3个注解。其中@Configuration、@ComponentScan是spring框架的语法，在spring 3.x就有了，
用于代码方式创建配置信息和扫描包。@EnableAutoConfiguration是spring boot语法，表示将使用自动配置。
你如果下载了spring boot源码，就会看到spring boot实现了很多starter应用，这些starter就是一些配置信息
（有点类似于docker，一组环境一种应用的概念），spring boot看到引入的starter包，就可以计算如果自动配置你的应用。
*/

@Controller
@SpringBootApplication
@RequestMapping(value = "/v2/rest")
public class RestDemo2 {
    @ResponseBody
    @RequestMapping(value = "/hello2")
    String home(){
        return "hello world!";
    }

    public static  void main(String[] args)throws Exception{
        SpringApplication.run(RestDemo2.class, "--server.port=8081");
    }
}
