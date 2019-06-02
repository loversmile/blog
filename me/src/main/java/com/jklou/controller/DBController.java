package com.jklou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/me")
public class DBController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getUsers")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from appuser";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Map.Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }

    @RequestMapping("/user/{id}")
    public Map<String,Object> getUser(@PathVariable int id){
        Map<String,Object> map = null;

        List<Map<String, Object>> list = getDbType();

        for (Map<String, Object> dbmap : list) {

            Set<String> set = dbmap.keySet();

            for (String key : set) {
                if(key.equals("id")){
                    System.out.println(dbmap.get(key));
                    System.out.println(id);
                    if(dbmap.get(key).equals(id)){
                        map = dbmap;
                        System.out.println(map);
                    }
                }
            }
        }

        if(map==null) {
            map = list.get(0);
            System.out.println("map is null");
        }
        return map;
    }

    @RequestMapping(value = "/getuser")
    public Map<String, Object> getUserByName(@RequestParam("username") String username) {
        System.out.println(username);
        Map<String, Object> map = null;
        List<Map<String, Object>> list = getDbType();

        for (Map<String, Object> dbmap : list) {
            Set<String> set = dbmap.keySet();

            for (String key : set) {
                if (key.equals("username")) {
                    System.out.println(dbmap.get(key));
                    System.out.println(username);
                    if(dbmap.get(key).equals(username)){
                        map = dbmap;
                    }
                }
            }
        }
        if(map==null)
            map = list.get(0);
        return map;
    }
}
