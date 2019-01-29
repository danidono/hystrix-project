package sk.didi.hystrixproject;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Component
@Slf4j
public class Komponenta{

    //Just a comment added for git tutorial purposes
    
    @Value("${komponenta.properties.value:lala, la, java}")
    private String value;

    @HystrixCommand(fallbackMethod = "getDefault", commandProperties = {@HystrixProperty(name = "circuitBreaker.forceOpen", value="false")})
    public String getKomponenta(){
        log.info("getKomponenta(): ");
        List<String> values = Arrays.stream(value.split(",")).map(s -> s.trim()).filter(s -> s.contains("bu")).collect(Collectors.toList());
        return "The result is : " + values;
    }

    @HystrixCommand
    public String getDefault(){
        log.info("getDefaulu(): ");
        return "Hystrix Default Method after Method failing.";
    }

}

