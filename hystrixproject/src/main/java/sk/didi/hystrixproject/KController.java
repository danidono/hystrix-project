package sk.didi.hystrixproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KController {
    @Autowired
    private Komponenta k;

    @RequestMapping(value = "/")
    public String callKomponenta(){
        return k.getKomponenta();
    }
    
     @RequestMapping(value = "/commitnew1")
    public String com1(){
        return "commitnew1";
    }

    @RequestMapping(value = "/commitmaster1")
    public String com(){
        return "commitmaster1";
    }

}
