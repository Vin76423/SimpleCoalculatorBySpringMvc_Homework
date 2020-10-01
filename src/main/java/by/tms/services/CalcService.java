package by.tms.services;

import by.tms.entity.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public double calc(String operationType, double num1, double num2) {
        switch (operationType) {
            case "SUM" -> {
                return num1 + num2;
            }
            case "SUB" -> {
                return num1 - num2;
            }
            case "MUL" -> {
                return num1 * num2;
            }
            case "DIV" -> {
                if (num2 == 0) {
                    throw new ArithmeticException();
                }
                return num1 / num2;
            }
            default -> throw new UnsupportedOperationException("Operation not found!");
        }
    }
}
