package snsProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SnsController {
    @GetMapping("snspage")
    public String userController(Model model) {
        model.addAttribute("data", "환영합니다!");
        return "sns";
    }
}
