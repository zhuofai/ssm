package top.zhuofai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.zhuofai.domain.Account;
import top.zhuofai.domain.User;

import java.util.Map;

@Controller
@RequestMapping("/con")
public class HelloControler {
    /**
     * 入门案例
     *
     * @return
     */
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello StringMVC");
        return "success";
    }

    @RequestMapping("/account")
    public String sayAccount(Account account) {
        System.out.println(account);
        return "success";
    }

    @RequestMapping("/money")
    public String saymoney1(@RequestParam(value = "money1") Float money) {
        System.out.println(money);
        return "success";
    }

    @RequestMapping("/body")
    public String saybody(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/header")
    public String sayheader(@RequestHeader(value = "accept") String header) {
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/cookie")
    public String cookie(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println(cookie);
        return "success";
    }

    /**
     * 接收请求
     * * @return
     */
    @RequestMapping(path = "/hello/{id}")
    public String sayHello(@PathVariable(value = "id") String id) {
        System.out.println(id);
        return "success";
    }





    /**
     * 作用在方法，先执行
     *  @param name
     *  @return
     */
    @ModelAttribute
    public void showUser(String name, Map<String, User> map) {
        System.out.println("showUser执行了...");
        // 模拟从数据库中查询对象
        User user = new User();
        user.setAge(123);
        map.put("abc", user);
    }

    /**
     * 修改用户的方法     * @param cookieValue     * @return
     */

    @RequestMapping(path = "/updateUser")
    public String updateUser1(@ModelAttribute(value = "abc") User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping(path = "/model")
    public String model(Model model){
        System.out.println("model");
        User user = new User();
        user.setAge(12);
        user.setName("zhuofai");
        model.addAttribute("user",user);
        return "model";
    }

    @RequestMapping(path = "/forward")
    public String forward(){
        System.out.println("forward");

        return "forward:/WEB-INF/pages/success.jsp";
    }
    @RequestMapping(path = "/redirect")
    public String redirect(){
        System.out.println("redirect");

        return "redirect:/hello.jsp";
    }
}
