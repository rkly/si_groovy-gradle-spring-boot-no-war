package hello

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

//@RestController
@Controller
class HelloController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    String index() {
        return "hello"
    }
    
    @RequestMapping(value="/test", method=RequestMethod.GET)
    String test() {
        return "test"
    }
}