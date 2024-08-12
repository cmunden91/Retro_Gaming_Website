package cmunden.retrogamingwebiste.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DemoController {
    @GetMapping("/")
    public fun homePage(model: Model): String {
        return "home";
    }
}
