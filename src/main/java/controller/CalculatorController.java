package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String Calculator() {
        return "calculator";
    }

    @PostMapping("/domath")
    public String Result(@RequestParam int firstNum, @RequestParam int secondNum, @RequestParam String operator, Model model) {
        int result = 0;
        switch (operator) {
            case "addition":
                result = firstNum + secondNum;
                break;
            case "subtraction":
                result = firstNum - secondNum;
                break;
            case "multiplication":
                result = firstNum * secondNum;
                break;
            case "division":
                try {
                    result = firstNum / secondNum;
                    break;
                } catch (ArithmeticException e){
                    throw new ArithmeticException("khong the chia cho 0");
                }
        }
        model.addAttribute("result", result);
        return "calculator";
    }
}
