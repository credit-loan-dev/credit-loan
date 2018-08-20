package com.sixliu.credit.user.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "user")
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String login(String username, String password) {

        Subject currentUser = SecurityUtils.getSubject();

        if (!currentUser.isAuthenticated()) {
            // 把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            // rememberme
            token.setRememberMe(true);
            try {
                // 执行登录.
                currentUser.login(token);
                System.out.println(currentUser.getPrincipal());
            }catch (AuthenticationException ae) {
                System.out.println("登录失败: " + ae.getMessage());
            }
        }
        return "aaa";
    }
}
