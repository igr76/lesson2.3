package pro.sky.skypospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    //public  String dobro() {

    public  int plus1(int num1,int num2) {
        return  num1+num2;
    }

    public  String minus(int num1,int num2) {
        return num1 + "<b> - </b>" + num2 + "<b> = </b>" + (num1 - num2);
    }

    public  String multiply(int num1,int num2) {
        return num1 + "<b> * </b>" + num2 + "<b> = </b>" + (num1 * num2);
    }

    public  String divide(int num1,int num2) {
        if ( num2 == 0) {
            return "<b>делить на ноль нельзя</b>";
        }
        return num1 + "<b> / </b>" + num2 + "<b> = </b>" + (num1 / num2);
    }


}
