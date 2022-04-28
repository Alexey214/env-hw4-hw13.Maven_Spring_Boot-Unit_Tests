package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(name = "num1", required = true) int i, @RequestParam(name = "num2", required = true) int j) {
        return i + " + " + j + " = " + calculatorService.plus(i, j);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(name = "num1", required = true) int i, @RequestParam(name = "num2", required = true) int j) {
        return i + " - " + j + " = " + calculatorService.minus(i, j);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(name = "num1", required = true) int i, @RequestParam(name = "num2", required = true) int j) {
        return i + " * " + j + " = " + calculatorService.multiply(i, j);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(name = "num1", required = true) double i, @RequestParam(name = "num2", required = true) double j) {
        if (j == 0) {
            return "На \"0\" делить нельзя!";
        }
        return i + " / " + j + " = " + calculatorService.divide(i, j);
    }

}
