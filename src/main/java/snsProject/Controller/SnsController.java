package snsProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SnsController {
    @GetMapping("snspage")
    public String userController(Model model) {
        model.addAttribute("data", "환영합니다!");
        return "sns";
    }

    @GetMapping("sns-mvc")
    public String snsMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "sns-template";
    }
}
