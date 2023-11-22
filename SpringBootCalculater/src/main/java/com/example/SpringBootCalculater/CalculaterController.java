package com.example.SpringBootCalculater;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculater")
public class CalculaterController {

	@GetMapping("/add/{num1}/{num2}")
    public double add(@PathVariable double num1, @PathVariable double num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/{num2}")
    public double subtract(@PathVariable double num1, @PathVariable double num2) {
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public double multiply(@PathVariable double num1, @PathVariable double num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/{num2}")
    public double divide(@PathVariable double num1, @PathVariable double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
