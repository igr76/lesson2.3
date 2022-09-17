package pro.sky.skypospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService CalculatorService;

    public CalculatorController(CalculatorService CalculatorService) {
        this.CalculatorService = CalculatorService;
    }

    @GetMapping(path = "/calculator")
    public String dobro() {
        return  "<b>добро пожаловать в калькулятор</b>" ;}

    @GetMapping(path = "/calculator/plus")
    public String plus1(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        if (num1 == 0 || num2 == 0) {
            return "<b> нехватает данных</b>" ;
        }
         CalculatorService.plus1(num1,num2);
        return num1 + "<b> + </b>" + num2 + "<b> = </b>" + (num1 + num2);

    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        if (num1 == 0 || num2 == 0) {
            return "<b> нехватает данных</b>" ;
        }
        return CalculatorService.minus(num1,num2);

    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        if (num1 == 0 || num2 == 0) {
            return "<b> нехватает данных</b>" ;
        }
        return CalculatorService.multiply(num1,num2);

    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        if (num1 == 0 || num2 == 0) {
            return "<b> нехватает данных</b>" ;
        }
        return CalculatorService.divide(num1,num2);

    }

}
