package top.zhuofai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zhuofai.domain.Account;
import top.zhuofai.service.AccountService;

import java.util.List;

/**
 * @author zhuofai
 */
@Controller
@RequestMapping("/user")
public class AccountController {
    @Autowired
    private AccountService as;
    @RequestMapping("/find")
    public String find(Model model){
        System.out.println("find方法被调用");
        List<Account> all = as.findAll();
        model.addAttribute("list",all);

        return "success";
    }
    @RequestMapping("/save")
    public String save(Account account){
        System.out.println("account调用");
        as.saveAccount(account);
        return "success";
    }
}
