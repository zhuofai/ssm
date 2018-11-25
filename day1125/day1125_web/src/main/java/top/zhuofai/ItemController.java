package top.zhuofai;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zhuofai.domain.Items;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemsService service;
    @RequestMapping("/findByName")
    public String findByName(String name, Model model){
        Items itemByName = service.findItemByName(name);
        model.addAttribute("items",itemByName);
        return "success";
    }
}
