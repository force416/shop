package org.eric.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = { "/system" })
public class SystemController {

    @RequestMapping(path = {"/info"}, method = RequestMethod.GET)
    public String index() {
        List<String> versionList = Arrays.asList("1.0.0");
        return versionList.get(0);
    }
}
