package com.sujal.springboot.myFirstWebApp.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    // say-hello => "Hello! What are you doing?"

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you doing?";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHTML(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello World!</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Hello! My name is Sujal!");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "hello-jsp";
    }
}
