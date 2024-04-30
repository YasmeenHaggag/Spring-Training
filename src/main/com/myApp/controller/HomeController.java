package main.com.myApp.controller;

/*import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;*/

import com.sun.net.httpserver.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController{
    @RequestMapping("/")
    public String home(){
        return "login" ;
    }

    @RequestMapping("/process")
    public String process(HttpServletRequest request, Model model){
       String name=request.getParameter("fname");

       model.addAttribute("studentName",name);
        return "home" ;
    }
}


