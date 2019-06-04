package nginx.nginx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloHtml(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        String rIP = request.getHeader("X-Real-IP");

        System.out.println(ip);
        System.out.println(rIP);
        return "/index";
    }
}