package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="dictionaryFileName", defaultValue="dictionary.txt") String dictionaryFileName,
                             @RequestParam(value="w1", defaultValue="code") String w1,
                             @RequestParam(value="w2", defaultValue="data") String w2) {
        return new Greeting( dictionaryFileName, w1, w2);
    }
}
