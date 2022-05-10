package zhang.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InedexController {

    // @Autowired
    // IndexService indexServiceImpl;


    @RequestMapping("login")
    public String returnLoginPage(){
        System.out.println("进入到login");
        return "login";
    }

    @RequestMapping("doLogin")
    public void doLogin(){
        System.out.println("点击了登入按钮");
    }

    @RequestMapping(value = {"index","success"})
    public String returnIndexPage(){
        //List<IndexDao> list = indexServiceImpl.getIndexDao();
        return "index";
    }

    @RequestMapping("home")
    public String returnHomePage(){
        return "home";
    }

}
