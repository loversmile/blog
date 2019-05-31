package com.jklou.controller;

import com.jklou.bean.AppMessage;
import com.jklou.service.AppMessageService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appmessage")
@MapperScan("com.jklou.mapper")
public class AppMessageController {
    @Autowired
    private AppMessageService service;

    @RequestMapping("/getThree")
    public List<AppMessage> getThreeForMessage(){

        List<AppMessage> list = service.getMessage();
        return list;
    }

    @RequestMapping("/getAll")
    public List<AppMessage> getAllMessage(){

        List<AppMessage> list = service.getAllMessage();
        int num = list.size();
        if(null!=list && num>3){
            for (int i = 0; i < num-3; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping("/getByID")
    public List<AppMessage> getMessageById(@RequestParam("id") String id){
        List<AppMessage> list = service.getMessageById(id);
        int num = list.size();
        if(null!=list && num>5){
            for (int i = 0; i < num-5; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int addMessage(@RequestBody AppMessage appMessage){
        System.out.println("out");
        return service.addMessage(appMessage);
    }

    @RequestMapping(value="/delMessageById",method=RequestMethod.POST)
    public int delMessageById(@RequestParam("id") String id){
        return service.delMessage(id);
    }
}
