package com.teamF.FlightBooking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               Model model) {

        if ("exampleUser".equals(username) && "examplePassword".equals(password)) {
            return "redirect:/home";
        }

        else {
            // Invalid credentials, show error message
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}