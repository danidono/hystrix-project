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

    @RequestMapping(value = "/lala")
    public String dontCall(){
        return "lala";
    }

    @RequestMapping(value = "/krakra")
    public String vranacall(){
        return "krakra";
    }

    @RequestMapping(value = "/vivi")
    public String callvivi(){
        return "vivi";
    }

}
