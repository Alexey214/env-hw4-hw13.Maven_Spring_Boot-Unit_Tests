package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int minus(int i, int j) {
        return i - j;
    }

    @Override
    public int multiply(int i, int j) {
        return i * j;
    }

    @Override
    public double divide(double i, double j) {
        return i / j;
    }

}
