package com.controller.query;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/query")
public class QueryController {
    @RequestMapping(value = "name")
    @ResponseBody
    public String queryUserInfo() {
        Map<Integer, String> userInfoMap = new HashMap<Integer, String>();
        userInfoMap.put(1, "memory");
        return userInfoMap.get(1);
    }
}
