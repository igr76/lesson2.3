package pro.sky.skypospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public  String hello() {
        return "<b>hello</b>";
    }

    public  String dobro() {
        return "<b>добро пожаловать в калькулятор</b>" ;
    }
    public  String nul() {
        return "<b> нехватает данных</b>" ;
    }
    public  int plus1(int num1,int num2) {
        return num1 + num2;
    }

    public  int minus(int num1,int num2) {
        return num1 - num2;
    }

    public  int multiply(int num1,int num2) {
        return num1 * num2;
    }

    public  int divide(int num1,int num2) {
        return num1 / num2;
    }


}
