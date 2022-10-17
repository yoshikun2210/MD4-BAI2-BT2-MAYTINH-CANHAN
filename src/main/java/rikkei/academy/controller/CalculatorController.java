package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;

@Controller
@RequestMapping("/")
public class CalculatorController extends HttpServlet {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @PostMapping("/")
    public ModelAndView calculate(@RequestParam String num1, @RequestParam String num2, @RequestParam String cal){
        ModelAndView modelAndView = new ModelAndView("index");
        double result=0;
        switch (cal){
            case "+":
                result = Double.parseDouble(num1)+Double.parseDouble(num2);
                break;
            case "-":
                result = Double.parseDouble(num1)-Double.parseDouble(num2);
                break;
            case "*":
                result = Double.parseDouble(num1)*Double.parseDouble(num2);
                break;
            case "/":
                result = Double.parseDouble(num1)/Double.parseDouble(num2);
                break;
        }
        modelAndView.addObject("num1", num1);
        modelAndView.addObject("num2", num2);
        modelAndView.addObject("result", result);
        return modelAndView;
    }


}