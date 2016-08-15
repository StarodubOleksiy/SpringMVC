package springMVC.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springMVC.service.DishService;

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
    private DishService dishService;

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }

    private DishController dishController;

    @Autowired
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    @RequestMapping(value= "/", method = RequestMethod.GET)

    public String index(Map<String, Object> model) {

        return "index";
    }


    @RequestMapping(value = "/findByWord", method = RequestMethod.GET)
    public ModelAndView findDish(@RequestParam("name") String name) {
        ModelAndView modelAndView = new ModelAndView();
        String header = " <tr> <th> Name </th> <th>Dish category </th>  <th>Price</th> <th>Weight</th> </tr>";
        modelAndView.addObject("der",header);
        modelAndView.addObject("finddish", dishService.getDishByName(name));
        String ingradientHeader = " <tr> <th> Ingradients </th> </tr>";
        modelAndView.addObject("ingradientHeader", ingradientHeader);
        modelAndView.addObject("ingradient", dishService.getDishByName(name).getIngradients());
        modelAndView.setViewName("index");
        System.out.println(name);
    return modelAndView;
}



}




