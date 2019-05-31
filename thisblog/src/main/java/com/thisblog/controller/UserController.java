package com.thisblog.controller;

import java.security.Principal;

@RestController
public class UserController {

    /*@GetMapping("/getHeadPortraitUrl")
    public JSONObject getHeadPortraitUrl(@AuthenticationPrincipal Principal principal){
        String username = principal.getName();
        return userService.getHeadPortraitUrl(userService.findIdByUsername(username));
    }*/
    public JSONObject getUserList() {

    }
}
