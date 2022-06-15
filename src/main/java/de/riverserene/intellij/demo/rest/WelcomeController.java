package de.riverserene.intellij.demo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@Autowired
	Quotes quotes;
	
    @Value("${welcome.message}")
    private String message;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);

        return "demo"; //view
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("tasks", tasks);

        return "list"; //view
    }

    @GetMapping("/reference")
    public String references() {
        return "ref"; //view
    }

    @GetMapping("/secure/data")
    public String secure(Model model) {
        model.addAttribute("quotes", quotes);
        return quotes.quotes(); //view
    }
}
