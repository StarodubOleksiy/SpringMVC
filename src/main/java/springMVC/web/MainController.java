package springMVC.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;




@Controller
public class MainController  {
    @RequestMapping(value= "/", method = RequestMethod.GET)

    public String index(Map<String, Object> model) {
        model.put("currentTime", new Date().toString());

        return "index";
    }


    @RequestMapping(value = "/{findByWord}", method = RequestMethod.POST)
    public ModelAndView checkUser(@PathVariable String name) {
        ModelAndView modelAndView = new ModelAndView();
    System.out.println(name);
    return modelAndView;
}


    }




