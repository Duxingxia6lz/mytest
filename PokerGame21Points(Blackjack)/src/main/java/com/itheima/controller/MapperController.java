package com.itheima.controller;

import com.itheima.domain.Poker;
import com.itheima.mapper.PokerMapper;
import com.itheima.util.CreatPoker;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MapperController {

    @Autowired
    private PokerMapper pokerMapper;


    @RequestMapping("/queryPoker")
    @ResponseBody
    public List<Poker> queryUser(){
        List<Poker> pokers = pokerMapper.queryPokerList();
        return pokers;
    }

    @RequestMapping("/savePoker")
    @ResponseBody
    public int savePoker(){
        List<Poker> pokerList = CreatPoker.create();

        int index = 0;
        for (int i = 0; i < pokerList.size(); i++) {
            pokerMapper.savePoker(pokerList.get(i));
            index++;
        }


        return index;
    }

}
