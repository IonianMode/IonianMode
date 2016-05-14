package eu.raffaelebua.ionian_mode.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import eu.raffaelebua.ionian_mode.model.Test;



@RestController
public class TestController {

    @RequestMapping(value = "/test/{content}", method= RequestMethod.GET)
    @Secured("ROLE_USER")
    public ResponseEntity<Test> test(@PathVariable String content ) {
        Test test = new Test(content);
        System.out.println(content);
        System.out.println(test.toString());
        return new ResponseEntity<Test>(test, HttpStatus.OK);
    }

}