package com.today.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ^---^---^---^---^---^---^---^
 * --v---v---v---v---v---v---v--
 *
 * @author zou.cp
 * @version 1.0
 * @Description
 * @createTime 2019年08月02日 17:33*
 * log.info()
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("index")
    public String index(){
        return "Hello World!!!";
    }
}
