package by.tms.controllers;

import by.tms.services.exceptions.DuplicateUserException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(value = UnsupportedOperationException.class)
    public String UnsupportedOperationHandler(UnsupportedOperationException e, Model model) {
        model.addAttribute("massage", e.getMessage());
        return "calc";
    }

    @ExceptionHandler(value = DuplicateUserException.class)
    public String DuplicateUserHandler(DuplicateUserException e, Model model) {
        model.addAttribute("massage", e.getMessage());
        return "reg";
    }

}
