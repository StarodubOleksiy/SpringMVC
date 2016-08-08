package springMVC.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springMVC.service.DishService;

/**
 * Created by Администратор on 04.08.16.
 */


@Controller
public class DishController {



    private DishService dishService;

    @Autowired
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }



   @RequestMapping(value = "/dishes", method = RequestMethod.GET)
    public String dishes(Map<String, Object> model) {
        model.put("dishes", dishService.getDishes() );
        return "dishes";
    }

    @RequestMapping(value = "/dish", method = RequestMethod.GET)
    public ModelAndView employee(@RequestParam("dishName")String dishName) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dish", dishService.getDishByName(dishName));
        modelAndView.addObject("ingradients", dishService.getDishByName(dishName).getIngradients());
        modelAndView.setViewName("dish");
        return modelAndView;
    }

}
