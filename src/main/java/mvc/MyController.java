package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String view(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails1(){
        return "ask-details-view";
    }

//    @RequestMapping("showDetails")
//    public String showDetails1(){
//        return "show-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showDetails1(HttpServletRequest request, Model model){
//        String empname = request.getParameter("employeeName");
//        empname = "Mr. " + empname;
//        model.addAttribute("nameAttribut",empname);
//
//        model.addAttribute("haker",  " - dangerous");
//        return "show-details-view";
//    }
@RequestMapping("/showDetails")
public String showDetails1(@RequestParam("employeeName") String empname, Model model){
    empname = "Mr. " + empname;
    model.addAttribute("nameAttribut",empname);

    model.addAttribute("haker",  " - haker dangerous");
    return "show-details-view";
}
}
