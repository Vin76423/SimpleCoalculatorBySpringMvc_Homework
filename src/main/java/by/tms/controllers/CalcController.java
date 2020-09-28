package by.tms.controllers;

import by.tms.services.CalcService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/calc")
public class CalcController {

    @GetMapping
    public String getForm() {
        return "calc";
    }

    @PostMapping
    public String getResult(@RequestParam("num1") double num1, @RequestParam("num2") double num2,
                            @RequestParam("operationType") String operationType, Model model) {
        double result = CalcService.valueOf(operationType).run(num1, num2);
        model.addAttribute("result", result);
        return "calc";
    }
}
