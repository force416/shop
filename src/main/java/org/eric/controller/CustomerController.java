package org.eric.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eric.utils.JSend;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = { "/customers" })
@Api("用户管理")
public class CustomerController {

    @RequestMapping(path = {"/signup"}, method = RequestMethod.POST)
    @ApiOperation(value = "註冊", notes = "註冊會員")
    public JSend signUp() {
        return JSend.success("");
    }

    @RequestMapping(path = {"/login"}, method = RequestMethod.POST)
    @ApiOperation(value = "登入", notes = "登入")
    public JSend login() {
        return JSend.success("");
    }

    @RequestMapping(path = {"/logout"}, method = RequestMethod.POST)
    @ApiOperation(value = "登出", notes = "登出")
    public JSend logout() {
        return JSend.success("");
    }
}
