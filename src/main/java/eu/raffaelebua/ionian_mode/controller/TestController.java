package eu.raffaelebua.ionian_mode.controller;



import eu.raffaelebua.ionian_mode.model.User;
import eu.raffaelebua.ionian_mode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import eu.raffaelebua.ionian_mode.model.Test;



@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test/{content}", method= RequestMethod.GET)
    @Secured("ROLE_USER")
    public ResponseEntity<Test> test(@PathVariable String content ) {
        Test test = new Test(content);
        System.out.println(content);
        System.out.println(test.toString());
        return new ResponseEntity<Test>(test, HttpStatus.OK);
    }

    @RequestMapping(value = "/signup", method=RequestMethod.POST)
    public ResponseEntity<?> signup(@RequestBody User user) {
       // try {
            userService.createUser(user);
      //  }catch (Exception ex){
            //todo: manage every kind of exceptions about registration
      //      return new ResponseEntity<String>(ex.getClass().getCanonicalName(), HttpStatus.BAD_REQUEST);
     //   }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}

