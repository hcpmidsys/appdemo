package cn.com.hyxc.hcpmidsys.modulelogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年09月23日 15:06
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","Hello SpringBoot!");
        return "test";
    }

//    @RequestMapping({"/","popupsignin"})//mvc扩展中已经实现
//    public String popupsignin(){
//        return "popupsignin";
//    }

    public String testGit(){
        return "Git111!";
    }

    public String testGit2(){
        return "git";
    }

    public String testGit3(){
        return "git1";
    }



}
