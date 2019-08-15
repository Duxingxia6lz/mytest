package com.itheima.mapper;

import com.itheima.domain.Poker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PokerMapper {

    //查询获取所有的牌
    public List<Poker> queryPokerList();


    /**
     * 保存牌
     * @param poker
     * @return
     */
    public int savePoker(Poker poker);



}


