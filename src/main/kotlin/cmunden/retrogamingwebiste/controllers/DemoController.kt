package cmunden.retrogamingwebiste.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @RequestMapping("/")
    @ResponseBody
    public fun demoReturn(): String {
        return "An example of the Rest controller return statement!";
    }
}
