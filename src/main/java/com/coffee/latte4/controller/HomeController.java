package com.coffee.latte4.controller;

import com.coffee.latte4.model.Latte4Beans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/")
public class HomeController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("/index");
        return mv;
    }


    @RequestMapping(value="/home", method= RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        List<String> resultList = new ArrayList<String>();
        for (int i = 0 ; i <= 10 ; i++) {
            resultList.add(Integer.toString(i));
        }

        Latte4Beans l4b = new Latte4Beans();
        l4b.setName("name1");
        l4b.setAddress("Seoul, Korea");

        mv.addObject("resultList", resultList);
        mv.addObject("l4b", l4b);
        mv.setViewName("/content/home");
        return mv;
    }
}
