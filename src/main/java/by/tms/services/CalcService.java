package by.tms.services;

import by.tms.entity.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public double calc(Operation operation) {
        switch (operation.getOperationType()) {
            case "SUM" -> {
                return operation.getNum1() + operation.getNum2();
            }
            case "SUB" -> {
                return operation.getNum1() - operation.getNum2();
            }
            case "MUL" -> {
                return operation.getNum1() * operation.getNum2();
            }
            case "DIV" -> {
                if (operation.getNum2() == 0) {
                    throw new ArithmeticException();
                }
                return operation.getNum1() / operation.getNum2();
            }
            default -> throw new UnsupportedOperationException("Operation not found!");
        }
    }
}
