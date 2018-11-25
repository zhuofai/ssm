package top.zhuofai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zhuofai.domain.User;
import top.zhuofai.exception.SynException;

/**
 * @author zhuofai
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/request")
    public @ResponseBody User request(@RequestBody User user){
        System.out.println(user);
        return user;
    }
    @RequestMapping("/testException")
    public String testException() throws SynException {
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SynException("这样的计算是错误的");
        }
        return "success";
    }
    @RequestMapping("/test")
    public String test(){
        System.out.println("test执行了");
        return "success";
    }
}
