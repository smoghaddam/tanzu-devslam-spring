package com.vmware.tanzu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    String Index(){
        return "Hello World!, This is saro";
    }

}
