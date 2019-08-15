package com.itheima.controller;

import com.itheima.domain.Poker;
import com.itheima.mapper.PokerMapper;
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



}
