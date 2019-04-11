package com.blueseaheart.core.controller;

import com.blueseaheart.core.service.LoginService;
import com.blueseaheart.core.util.CommonUtils;
import com.blueseaheart.core.vo.ResponseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by Walker on 2018/4/23.
 */
@Controller
@RequestMapping("/auth")
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/login")
    @ResponseBody
    public ResponseVo login(String loginUser,
                            String password,
                            HttpServletRequest request,
                            HttpServletResponse response) {
        ResponseVo responseVo = new ResponseVo();
        Integer au = loginService.addUser("as21");
       int i= loginService.updateHx();
        CommonUtils.countNum(loginUser);
//        stringRedisTemplate.opsForValue().set("as21", "as20241", 20, TimeUnit.SECONDS);
//        System.out.println(stringRedisTemplate.opsForValue().get("as21"));

        responseVo.getData().put("hah", CommonUtils.getRadomCharacters(-1));
        responseVo.getData().put("au", au);
        responseVo.setErrorCode(0);
        responseVo.setErrorMsg("成功");
        return responseVo;
    }
}
