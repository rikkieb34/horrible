package contollers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class IndexController {

    @RequestMapping(value = "")
    public String getIndex() {
        return "index";
    }

    @RequestMapping(value = "test")
    public String getTest(Model model) {
        model.addAttribute("title", "Testing");
        model.addAttribute("different", "test");
        return "test";
    }
}
