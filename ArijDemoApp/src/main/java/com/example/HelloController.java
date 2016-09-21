package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * Created by Arij Hussain on 9/19/2016.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/ipaddress", method = RequestMethod.GET,
            produces = "application/json")
    public String getIPMethod() throws UnknownHostException {
        String IP=InetAddress.getLocalHost().getHostAddress();
        return "IP address : "+IP;
    }

    @RequestMapping(value = "/rannum", method = RequestMethod.GET,
            produces = "application/json")
    public String getRandomNumber(){
        Integer randomInt = 0;
        Random random = new Random();
        for (int idx = 1; idx <= 10; ++idx){
             randomInt = random.nextInt(100);
        }
        return  "Random Numner : "+randomInt.toString();
    }
}
