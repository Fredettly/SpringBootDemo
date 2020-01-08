package com.fredettly.demo.controller;

import com.fredettly.demo.dto.AccessTokenDTO;
import com.fredettly.demo.dto.GithubUser;
import com.fredettly.demo.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xwx_ on 2020/1/7
 */
@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;
    @Value("${github.Client_id}")
    private String ClientId;
    @Value("${github.Client_secret}")
    private String ClientSecret;
    @Value("${github.Redirect_uri}")
    private String RedirectUri;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletRequest request) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id(ClientId);
        accessTokenDTO.setClient_secret(ClientSecret);
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri(RedirectUri);
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            //登录成功，写session&cookie
            return "redirect:/";
        } else {
            //登录失败,重新登录
            return "redirect:/";
        }

    }
}
